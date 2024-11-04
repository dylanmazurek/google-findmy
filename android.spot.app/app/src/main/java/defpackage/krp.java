package defpackage;

import android.content.Context;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class krp {
    private static final Pattern a = Pattern.compile("[0-9]+s");
    private static final Charset b = Charset.forName("UTF-8");
    private final Context c;
    private final kqz d;
    private final krr e = new krr();

    public krp(Context context, kqz kqzVar) {
        this.c = context;
        this.d = kqzVar;
    }

    static long a(String str) {
        fma.aG(a.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str != null && str.length() != 0) {
            return Long.parseLong(str.substring(0, str.length() - 1));
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009b A[Catch: NameNotFoundException -> 0x00db, TryCatch #2 {NameNotFoundException -> 0x00db, blocks: (B:8:0x0068, B:10:0x007e, B:12:0x0084, B:15:0x008b, B:17:0x009b, B:21:0x00b1, B:23:0x00bb, B:25:0x00d6), top: B:7:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1 A[Catch: NameNotFoundException -> 0x00db, TryCatch #2 {NameNotFoundException -> 0x00db, blocks: (B:8:0x0068, B:10:0x007e, B:12:0x0084, B:15:0x008b, B:17:0x009b, B:21:0x00b1, B:23:0x00bb, B:25:0x00d6), top: B:7:0x0068 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.net.HttpURLConnection d(java.net.URL r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.krp.d(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }

    private static void e() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void f(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String concat;
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, b));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (!TextUtils.isEmpty(str4)) {
            Log.w("Firebase-Installations", str4);
            if (TextUtils.isEmpty(str)) {
                concat = "";
            } else {
                concat = ", ".concat(String.valueOf(str));
            }
            Log.w("Firebase-Installations", String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, concat));
        }
    }

    private static void g(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    private static boolean h(int i) {
        if (i >= 200 && i < 300) {
            return true;
        }
        return false;
    }

    private static byte[] i(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static final URL j(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e) {
            throw new kre(e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public final krq b(String str, String str2, String str3, String str4, String str5) {
        String str6;
        JSONObject jSONObject;
        int responseCode;
        krq krqVar;
        String str7;
        String str8;
        String str9 = str5;
        String str10 = "fid";
        if (this.e.b()) {
            int i = 0;
            URL j = j(String.format("projects/%s/installations", str3));
            for (?? r8 = 1; i <= r8; r8 = 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection d = d(j, str);
                try {
                    try {
                        d.setRequestMethod("POST");
                        d.setDoOutput(r8);
                        if (str9 != null) {
                            d.addRequestProperty("x-goog-fis-android-iid-migration-auth", str9);
                        }
                        try {
                            jSONObject = new JSONObject();
                        } catch (JSONException e) {
                            e = e;
                        }
                    } catch (IOException | AssertionError unused) {
                    }
                    try {
                        try {
                            jSONObject.put(str10, str2);
                            jSONObject.put("appId", str4);
                            jSONObject.put("authVersion", "FIS_v2");
                            jSONObject.put("sdkVersion", "a:17.0.2_1p");
                            g(d, i(jSONObject));
                            responseCode = d.getResponseCode();
                            this.e.a(responseCode);
                        } catch (JSONException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        }
                    } catch (IOException | AssertionError unused2) {
                        str6 = str10;
                        d.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i++;
                        str9 = str5;
                        str10 = str6;
                    }
                    if (h(responseCode)) {
                        InputStream inputStream = d.getInputStream();
                        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, b));
                        krs a2 = krt.a();
                        jsonReader.beginObject();
                        String str11 = null;
                        String str12 = null;
                        String str13 = null;
                        krt krtVar = null;
                        while (jsonReader.hasNext()) {
                            String nextName = jsonReader.nextName();
                            if (nextName.equals("name")) {
                                str11 = jsonReader.nextString();
                            } else if (nextName.equals(str10)) {
                                str12 = jsonReader.nextString();
                            } else if (nextName.equals("refreshToken")) {
                                str13 = jsonReader.nextString();
                            } else {
                                if (nextName.equals("authToken")) {
                                    jsonReader.beginObject();
                                    while (jsonReader.hasNext()) {
                                        String nextName2 = jsonReader.nextName();
                                        if (nextName2.equals("token")) {
                                            a2.a = jsonReader.nextString();
                                        } else {
                                            if (nextName2.equals("expiresIn")) {
                                                str8 = str10;
                                                a2.b(a(jsonReader.nextString()));
                                            } else {
                                                str8 = str10;
                                                jsonReader.skipValue();
                                            }
                                            str10 = str8;
                                        }
                                    }
                                    str7 = str10;
                                    krtVar = a2.a();
                                    jsonReader.endObject();
                                } else {
                                    str7 = str10;
                                    jsonReader.skipValue();
                                }
                                str10 = str7;
                            }
                        }
                        jsonReader.endObject();
                        jsonReader.close();
                        inputStream.close();
                        krqVar = new krq(str11, str12, str13, krtVar, 1);
                    } else {
                        try {
                            str6 = str10;
                            f(d, str4, str, str3);
                        } catch (IOException | AssertionError unused3) {
                            continue;
                        }
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                e();
                                krqVar = new krq(null, null, null, null, 2);
                            } else {
                                d.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i++;
                                str9 = str5;
                                str10 = str6;
                            }
                        } else {
                            throw new kre("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    }
                    return krqVar;
                } finally {
                    d.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            throw new kre("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new kre("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final krt c(String str, String str2, String str3, String str4) {
        krt a2;
        if (this.e.b()) {
            URL j = j(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
            for (int i = 0; i <= 1; i++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection d = d(j, str);
                try {
                    try {
                        d.setRequestMethod("POST");
                        d.addRequestProperty("Authorization", a.ao(str4, "FIS_v2 "));
                        d.setDoOutput(true);
                    } catch (IOException | AssertionError unused) {
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("sdkVersion", "a:17.0.2_1p");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("installation", jSONObject);
                        g(d, i(jSONObject2));
                        int responseCode = d.getResponseCode();
                        this.e.a(responseCode);
                        if (h(responseCode)) {
                            InputStream inputStream = d.getInputStream();
                            JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, b));
                            krs a3 = krt.a();
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String nextName = jsonReader.nextName();
                                if (nextName.equals("token")) {
                                    a3.a = jsonReader.nextString();
                                } else if (nextName.equals("expiresIn")) {
                                    a3.b(a(jsonReader.nextString()));
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            jsonReader.close();
                            inputStream.close();
                            a3.b = 1;
                            a2 = a3.a();
                        } else {
                            f(d, null, str, str3);
                            if (responseCode != 401 && responseCode != 404) {
                                if (responseCode != 429) {
                                    if (responseCode < 500 || responseCode >= 600) {
                                        e();
                                        krs a4 = krt.a();
                                        a4.b = 2;
                                        a2 = a4.a();
                                    } else {
                                        d.disconnect();
                                        TrafficStats.clearThreadStatsTag();
                                    }
                                } else {
                                    throw new kre("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                                }
                            }
                            krs a5 = krt.a();
                            a5.b = 3;
                            a2 = a5.a();
                        }
                        return a2;
                    } catch (JSONException e) {
                        throw new IllegalStateException(e);
                    }
                } finally {
                    d.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            throw new kre("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new kre("Firebase Installations Service is unavailable. Please try again later.");
    }
}
