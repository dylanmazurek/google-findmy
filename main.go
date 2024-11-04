package main

import (
	"io"
	"log"
	"net/http"
	"os"

	"github.com/dylanmazurek/google-findmy/api/bindings"
	"google.golang.org/protobuf/proto"
)

// https://android.googleapis.com/nova/nbe_list_devices

func main() {
	file, err := os.OpenFile("exampleoutput.txt", 0, 0644)
	if err != nil {
		log.Fatal(err)
	}

	defer file.Close()
	body, err := io.ReadAll(file)
	if err != nil {
		log.Printf("Error: %f", err)
	}

	var deviceList bindings.DeviceList
	if err := proto.Unmarshal(body, &deviceList); err != nil {
		log.Printf("Error: %v", err)
	}

	for _, device := range deviceList.Devices {
		log.Printf("device: %s", device.GetD().GetCarrierName())
	}

	//log.Println(deviceList.String())
}

func main2() {
	url := "https://android.googleapis.com/nova/nbe_list_devices"

	newRequest, err := http.NewRequest(http.MethodPost, url, nil)
	if err != nil {
		panic(err)
	}

	oauthToken := os.Getenv("GOOGLE_OAUTH_TOKEN")
	newRequest.Header.Set("Authorization", "Bearer "+oauthToken)

	resp, err := http.DefaultClient.Do(newRequest)
	if err != nil {
		panic(err)
	}

	defer resp.Body.Close()
	body, err := io.ReadAll(resp.Body)
	if err != nil {
		panic(err)
	}

	err = os.WriteFile("exampleoutput.txt", body, 0644)
	if err != nil {
		log.Fatal(err)
	}

	// var deviceList bindings.Device
	// if err := proto.Unmarshal(body, &deviceList); err != nil {
	// 	panic(err)
	// }

	//log.Printf("Devices: %s", deviceList.String())
}
