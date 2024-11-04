package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.AdditionalConsentConfig;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ServiceDumpRequest;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.findmydevice.spot.CachedSpotDevice;
import com.google.android.gms.findmydevice.spot.ChangeFindMyDeviceSettingsRequest;
import com.google.android.gms.findmydevice.spot.ChangeFindMyDeviceSettingsResponse;
import com.google.android.gms.findmydevice.spot.FindMyDeviceNetworkSettings;
import com.google.android.gms.findmydevice.spot.GetCachedDevicesResponse;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsRequest;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsResponse;
import com.google.android.gms.findmydevice.spot.GetKeychainLockScreenKnowledgeFactorSupportRequest;
import com.google.android.gms.findmydevice.spot.GetKeychainLockScreenKnowledgeFactorSupportResponse;
import com.google.android.gms.findmydevice.spot.GetLocationReportingStateResponse;
import com.google.android.gms.findmydevice.spot.GetOwnerKeyRequest;
import com.google.android.gms.findmydevice.spot.GetOwnerKeyResponse;
import com.google.android.gms.findmydevice.spot.GetWearableProvisioningStateResponse;
import com.google.android.gms.findmydevice.spot.ImportGivenOwnerKeyRequest;
import com.google.android.gms.findmydevice.spot.ImportGivenOwnerKeyResponse;
import com.google.android.gms.findmydevice.spot.ImportRequiredOwnerKeysResponse;
import com.google.android.gms.findmydevice.spot.LocationReportResponse;
import com.google.android.gms.findmydevice.spot.OwnersLocationReportRequest;
import com.google.android.gms.findmydevice.spot.ScanResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnk implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public fnk(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i5 = 0;
        String str = null;
        Account account = null;
        Account account2 = null;
        byte[] bArr = null;
        Account account3 = null;
        Account account4 = null;
        CachedSpotDevice[] cachedSpotDeviceArr = null;
        switch (this.a) {
            case 0:
                int aj = fma.aj(parcel);
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                Bundle bundle = null;
                while (parcel.dataPosition() < aj) {
                    int readInt = parcel.readInt();
                    switch (fma.af(readInt)) {
                        case 2:
                            str2 = fma.as(parcel, readInt);
                            break;
                        case 3:
                            str3 = fma.as(parcel, readInt);
                            break;
                        case 4:
                            str4 = fma.as(parcel, readInt);
                            break;
                        case 5:
                            str5 = fma.as(parcel, readInt);
                            break;
                        case 6:
                            str6 = fma.as(parcel, readInt);
                            break;
                        case 7:
                            bundle = fma.al(parcel, readInt);
                            break;
                        default:
                            fma.ax(parcel, readInt);
                            break;
                    }
                }
                fma.aw(parcel, aj);
                return new AdditionalConsentConfig(str2, str3, str4, str5, str6, bundle);
            case 1:
                int aj2 = fma.aj(parcel);
                String str7 = null;
                ServiceDumpRequest[] serviceDumpRequestArr = null;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                while (parcel.dataPosition() < aj2) {
                    int readInt2 = parcel.readInt();
                    switch (fma.af(readInt2)) {
                        case 2:
                            str7 = fma.as(parcel, readInt2);
                            break;
                        case 3:
                            z5 = fma.ay(parcel, readInt2);
                            break;
                        case 4:
                            z6 = fma.ay(parcel, readInt2);
                            break;
                        case 5:
                            z7 = fma.ay(parcel, readInt2);
                            break;
                        case 6:
                            z8 = fma.ay(parcel, readInt2);
                            break;
                        case 7:
                            serviceDumpRequestArr = (ServiceDumpRequest[]) fma.aB(parcel, readInt2, ServiceDumpRequest.CREATOR);
                            break;
                        default:
                            fma.ax(parcel, readInt2);
                            break;
                    }
                }
                fma.aw(parcel, aj2);
                return new LogOptions(str7, z5, z6, z7, z8, serviceDumpRequestArr);
            case 2:
                int aj3 = fma.aj(parcel);
                int i6 = 0;
                while (parcel.dataPosition() < aj3) {
                    int readInt3 = parcel.readInt();
                    int af = fma.af(readInt3);
                    if (af != 2) {
                        if (af != 3) {
                            fma.ax(parcel, readInt3);
                        } else {
                            i6 = fma.ah(parcel, readInt3);
                        }
                    } else {
                        i = fma.ah(parcel, readInt3);
                    }
                }
                fma.aw(parcel, aj3);
                return new ThemeSettings(i, i6);
            case 3:
                int aj4 = fma.aj(parcel);
                String str8 = null;
                while (parcel.dataPosition() < aj4) {
                    int readInt4 = parcel.readInt();
                    int af2 = fma.af(readInt4);
                    if (af2 != 1) {
                        if (af2 != 2) {
                            fma.ax(parcel, readInt4);
                        } else {
                            str8 = fma.as(parcel, readInt4);
                        }
                    } else {
                        str = fma.as(parcel, readInt4);
                    }
                }
                fma.aw(parcel, aj4);
                return new CachedSpotDevice(str, str8);
            case 4:
                int aj5 = fma.aj(parcel);
                Boolean bool = null;
                Boolean bool2 = null;
                Boolean bool3 = null;
                FindMyDeviceNetworkSettings findMyDeviceNetworkSettings = null;
                boolean z9 = false;
                while (parcel.dataPosition() < aj5) {
                    int readInt5 = parcel.readInt();
                    int af3 = fma.af(readInt5);
                    if (af3 != 1) {
                        if (af3 != 2) {
                            if (af3 != 3) {
                                if (af3 != 4) {
                                    if (af3 != 5) {
                                        fma.ax(parcel, readInt5);
                                    } else {
                                        findMyDeviceNetworkSettings = (FindMyDeviceNetworkSettings) fma.an(parcel, readInt5, FindMyDeviceNetworkSettings.CREATOR);
                                    }
                                } else {
                                    bool2 = fma.ao(parcel, readInt5);
                                }
                            } else {
                                z9 = fma.ay(parcel, readInt5);
                            }
                        } else {
                            bool3 = fma.ao(parcel, readInt5);
                        }
                    } else {
                        bool = fma.ao(parcel, readInt5);
                    }
                }
                fma.aw(parcel, aj5);
                return new ChangeFindMyDeviceSettingsRequest(bool, bool2, bool3, findMyDeviceNetworkSettings, z9);
            case 5:
                int aj6 = fma.aj(parcel);
                while (parcel.dataPosition() < aj6) {
                    fma.ax(parcel, parcel.readInt());
                }
                fma.aw(parcel, aj6);
                return new ChangeFindMyDeviceSettingsResponse();
            case 6:
                int aj7 = fma.aj(parcel);
                while (parcel.dataPosition() < aj7) {
                    int readInt6 = parcel.readInt();
                    if (fma.af(readInt6) != 1) {
                        fma.ax(parcel, readInt6);
                    } else {
                        i5 = fma.ah(parcel, readInt6);
                    }
                }
                fma.aw(parcel, aj7);
                return new FindMyDeviceNetworkSettings(i5);
            case 7:
                int aj8 = fma.aj(parcel);
                while (parcel.dataPosition() < aj8) {
                    int readInt7 = parcel.readInt();
                    if (fma.af(readInt7) != 1) {
                        fma.ax(parcel, readInt7);
                    } else {
                        cachedSpotDeviceArr = (CachedSpotDevice[]) fma.aB(parcel, readInt7, CachedSpotDevice.CREATOR);
                    }
                }
                fma.aw(parcel, aj8);
                return new GetCachedDevicesResponse(cachedSpotDeviceArr);
            case 8:
                int aj9 = fma.aj(parcel);
                while (parcel.dataPosition() < aj9) {
                    fma.ax(parcel, parcel.readInt());
                }
                fma.aw(parcel, aj9);
                return new GetFindMyDeviceSettingsRequest();
            case 9:
                int aj10 = fma.aj(parcel);
                long j = 0;
                long j2 = 0;
                FindMyDeviceNetworkSettings findMyDeviceNetworkSettings2 = null;
                Account account5 = null;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                while (parcel.dataPosition() < aj10) {
                    int readInt8 = parcel.readInt();
                    switch (fma.af(readInt8)) {
                        case 3:
                            z12 = fma.ay(parcel, readInt8);
                            break;
                        case 4:
                        default:
                            fma.ax(parcel, readInt8);
                            break;
                        case 5:
                            j = fma.ak(parcel, readInt8);
                            break;
                        case 6:
                            z10 = fma.ay(parcel, readInt8);
                            break;
                        case 7:
                            z11 = fma.ay(parcel, readInt8);
                            break;
                        case 8:
                            z13 = fma.ay(parcel, readInt8);
                            break;
                        case 9:
                            z14 = fma.ay(parcel, readInt8);
                            break;
                        case 10:
                            findMyDeviceNetworkSettings2 = (FindMyDeviceNetworkSettings) fma.an(parcel, readInt8, FindMyDeviceNetworkSettings.CREATOR);
                            break;
                        case 11:
                            j2 = fma.ak(parcel, readInt8);
                            break;
                        case 12:
                            account5 = (Account) fma.an(parcel, readInt8, Account.CREATOR);
                            break;
                        case 13:
                            z15 = fma.ay(parcel, readInt8);
                            break;
                    }
                }
                fma.aw(parcel, aj10);
                return new GetFindMyDeviceSettingsResponse(z10, z11, findMyDeviceNetworkSettings2, z12, j, j2, z13, z14, account5, z15);
            case 10:
                int aj11 = fma.aj(parcel);
                while (parcel.dataPosition() < aj11) {
                    int readInt9 = parcel.readInt();
                    int af4 = fma.af(readInt9);
                    if (af4 != 1) {
                        if (af4 != 2) {
                            fma.ax(parcel, readInt9);
                        } else {
                            z4 = fma.ay(parcel, readInt9);
                        }
                    } else {
                        account4 = (Account) fma.an(parcel, readInt9, Account.CREATOR);
                    }
                }
                fma.aw(parcel, aj11);
                return new GetKeychainLockScreenKnowledgeFactorSupportRequest(account4, z4);
            case 11:
                int aj12 = fma.aj(parcel);
                Boolean bool4 = null;
                Boolean bool5 = null;
                boolean z16 = false;
                while (parcel.dataPosition() < aj12) {
                    int readInt10 = parcel.readInt();
                    int af5 = fma.af(readInt10);
                    if (af5 != 1) {
                        if (af5 != 2) {
                            if (af5 != 3) {
                                if (af5 != 4) {
                                    fma.ax(parcel, readInt10);
                                } else {
                                    bool5 = fma.ao(parcel, readInt10);
                                }
                            } else {
                                bool4 = fma.ao(parcel, readInt10);
                            }
                        } else {
                            z16 = fma.ay(parcel, readInt10);
                        }
                    } else {
                        z3 = fma.ay(parcel, readInt10);
                    }
                }
                fma.aw(parcel, aj12);
                return new GetKeychainLockScreenKnowledgeFactorSupportResponse(z3, z16, bool4, bool5);
            case 12:
                int aj13 = fma.aj(parcel);
                while (parcel.dataPosition() < aj13) {
                    int readInt11 = parcel.readInt();
                    if (fma.af(readInt11) != 1) {
                        fma.ax(parcel, readInt11);
                    } else {
                        z2 = fma.ay(parcel, readInt11);
                    }
                }
                fma.aw(parcel, aj13);
                return new GetLocationReportingStateResponse(z2);
            case 13:
                int aj14 = fma.aj(parcel);
                while (parcel.dataPosition() < aj14) {
                    int readInt12 = parcel.readInt();
                    if (fma.af(readInt12) != 1) {
                        fma.ax(parcel, readInt12);
                    } else {
                        account3 = (Account) fma.an(parcel, readInt12, Account.CREATOR);
                    }
                }
                fma.aw(parcel, aj14);
                return new GetOwnerKeyRequest(account3);
            case 14:
                int aj15 = fma.aj(parcel);
                while (parcel.dataPosition() < aj15) {
                    int readInt13 = parcel.readInt();
                    int af6 = fma.af(readInt13);
                    if (af6 != 1) {
                        if (af6 != 2) {
                            fma.ax(parcel, readInt13);
                        } else {
                            bArr = fma.az(parcel, readInt13);
                        }
                    } else {
                        i4 = fma.ah(parcel, readInt13);
                    }
                }
                fma.aw(parcel, aj15);
                return new GetOwnerKeyResponse(i4, bArr);
            case 15:
                int aj16 = fma.aj(parcel);
                Account account6 = null;
                String str9 = null;
                boolean z17 = false;
                while (parcel.dataPosition() < aj16) {
                    int readInt14 = parcel.readInt();
                    int af7 = fma.af(readInt14);
                    if (af7 != 1) {
                        if (af7 != 2) {
                            if (af7 != 3) {
                                if (af7 != 4) {
                                    fma.ax(parcel, readInt14);
                                } else {
                                    str9 = fma.as(parcel, readInt14);
                                }
                            } else {
                                i3 = fma.ah(parcel, readInt14);
                            }
                        } else {
                            z17 = fma.ay(parcel, readInt14);
                        }
                    } else {
                        account6 = (Account) fma.an(parcel, readInt14, Account.CREATOR);
                    }
                }
                fma.aw(parcel, aj16);
                return new GetWearableProvisioningStateResponse(i3, account6, z17, str9);
            case 16:
                int aj17 = fma.aj(parcel);
                while (parcel.dataPosition() < aj17) {
                    int readInt15 = parcel.readInt();
                    int af8 = fma.af(readInt15);
                    if (af8 != 1) {
                        if (af8 != 2) {
                            fma.ax(parcel, readInt15);
                        } else {
                            i2 = fma.ah(parcel, readInt15);
                        }
                    } else {
                        account2 = (Account) fma.an(parcel, readInt15, Account.CREATOR);
                    }
                }
                fma.aw(parcel, aj17);
                return new ImportGivenOwnerKeyRequest(account2, i2);
            case 17:
                int aj18 = fma.aj(parcel);
                while (parcel.dataPosition() < aj18) {
                    int readInt16 = parcel.readInt();
                    if (fma.af(readInt16) != 1) {
                        fma.ax(parcel, readInt16);
                    } else {
                        z = fma.ay(parcel, readInt16);
                    }
                }
                fma.aw(parcel, aj18);
                return new ImportGivenOwnerKeyResponse(z);
            case 18:
                int aj19 = fma.aj(parcel);
                while (parcel.dataPosition() < aj19) {
                    fma.ax(parcel, parcel.readInt());
                }
                fma.aw(parcel, aj19);
                return new ImportRequiredOwnerKeysResponse();
            case 19:
                int aj20 = fma.aj(parcel);
                while (parcel.dataPosition() < aj20) {
                    fma.ax(parcel, parcel.readInt());
                }
                fma.aw(parcel, aj20);
                return new LocationReportResponse();
            default:
                int aj21 = fma.aj(parcel);
                ScanResult scanResult = null;
                while (parcel.dataPosition() < aj21) {
                    int readInt17 = parcel.readInt();
                    int af9 = fma.af(readInt17);
                    if (af9 != 1) {
                        if (af9 != 2) {
                            fma.ax(parcel, readInt17);
                        } else {
                            scanResult = (ScanResult) fma.an(parcel, readInt17, ScanResult.CREATOR);
                        }
                    } else {
                        account = (Account) fma.an(parcel, readInt17, Account.CREATOR);
                    }
                }
                fma.aw(parcel, aj21);
                return new OwnersLocationReportRequest(account, scanResult);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new AdditionalConsentConfig[i];
            case 1:
                return new LogOptions[i];
            case 2:
                return new ThemeSettings[i];
            case 3:
                return new CachedSpotDevice[i];
            case 4:
                return new ChangeFindMyDeviceSettingsRequest[i];
            case 5:
                return new ChangeFindMyDeviceSettingsResponse[i];
            case 6:
                return new FindMyDeviceNetworkSettings[i];
            case 7:
                return new GetCachedDevicesResponse[i];
            case 8:
                return new GetFindMyDeviceSettingsRequest[i];
            case 9:
                return new GetFindMyDeviceSettingsResponse[i];
            case 10:
                return new GetKeychainLockScreenKnowledgeFactorSupportRequest[i];
            case 11:
                return new GetKeychainLockScreenKnowledgeFactorSupportResponse[i];
            case 12:
                return new GetLocationReportingStateResponse[i];
            case 13:
                return new GetOwnerKeyRequest[i];
            case 14:
                return new GetOwnerKeyResponse[i];
            case 15:
                return new GetWearableProvisioningStateResponse[i];
            case 16:
                return new ImportGivenOwnerKeyRequest[i];
            case 17:
                return new ImportGivenOwnerKeyResponse[i];
            case 18:
                return new ImportRequiredOwnerKeysResponse[i];
            case 19:
                return new LocationReportResponse[i];
            default:
                return new OwnersLocationReportRequest[i];
        }
    }
}
