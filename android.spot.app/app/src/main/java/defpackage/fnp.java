package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ServiceDump;
import com.google.android.gms.feedback.ServiceDumpRequest;
import com.google.android.gms.findmydevice.spot.OwnersLocationReportResponse;
import com.google.android.gms.findmydevice.spot.ProvisionWearableDeviceResponse;
import com.google.android.gms.findmydevice.spot.ScanResult;
import com.google.android.gms.findmydevice.spot.SetOwnerKeyResponse;
import com.google.android.gms.findmydevice.spot.StartFinderAdvertisingRequest;
import com.google.android.gms.findmydevice.spot.StartFinderAdvertisingResponse;
import com.google.android.gms.findmydevice.spot.SyncOwnerKeyRequest;
import com.google.android.gms.findmydevice.spot.SyncOwnerKeyResponse;
import com.google.android.gms.findmydevice.spot.UnprovisionWearableDeviceResponse;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.gms.googlehelp.trails.TrailsInteraction;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnp implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public fnp(int i) {
        this.a = i;
    }

    public static void a(InProductHelp inProductHelp, Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.W(parcel, 1, inProductHelp.a, i);
        fma.X(parcel, 2, inProductHelp.b);
        fma.X(parcel, 3, inProductHelp.c);
        fma.L(parcel, 4, inProductHelp.d);
        fma.X(parcel, 5, inProductHelp.e);
        fma.L(parcel, 6, inProductHelp.f);
        fma.X(parcel, 7, inProductHelp.g);
        fma.F(parcel, D);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        ServiceDumpRequest serviceDumpRequest = null;
        Status status = null;
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Boolean bool = null;
        Account account = null;
        String str6 = null;
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                int aj = fma.aj(parcel);
                byte[] bArr2 = null;
                while (parcel.dataPosition() < aj) {
                    int readInt = parcel.readInt();
                    int af = fma.af(readInt);
                    if (af != 2) {
                        if (af != 3) {
                            fma.ax(parcel, readInt);
                        } else {
                            bArr2 = fma.az(parcel, readInt);
                        }
                    } else {
                        serviceDumpRequest = (ServiceDumpRequest) fma.an(parcel, readInt, ServiceDumpRequest.CREATOR);
                    }
                }
                fma.aw(parcel, aj);
                return new ServiceDump(serviceDumpRequest, bArr2);
            case 1:
                int aj2 = fma.aj(parcel);
                while (parcel.dataPosition() < aj2) {
                    fma.ax(parcel, parcel.readInt());
                }
                fma.aw(parcel, aj2);
                return new OwnersLocationReportResponse();
            case 2:
                int aj3 = fma.aj(parcel);
                while (parcel.dataPosition() < aj3) {
                    fma.ax(parcel, parcel.readInt());
                }
                fma.aw(parcel, aj3);
                return new ProvisionWearableDeviceResponse();
            case 3:
                int aj4 = fma.aj(parcel);
                HashSet hashSet = new HashSet();
                while (parcel.dataPosition() < aj4) {
                    int readInt2 = parcel.readInt();
                    int af2 = fma.af(readInt2);
                    if (af2 != 1) {
                        if (af2 != 2) {
                            fma.ax(parcel, readInt2);
                        } else {
                            i = fma.ah(parcel, readInt2);
                            hashSet.add(2);
                        }
                    } else {
                        bArr = fma.az(parcel, readInt2);
                        hashSet.add(1);
                    }
                }
                if (parcel.dataPosition() == aj4) {
                    return new ScanResult(hashSet, bArr, i);
                }
                throw new flm(a.ae(aj4, "Overread allowed size end="), parcel);
            case 4:
                int aj5 = fma.aj(parcel);
                while (parcel.dataPosition() < aj5) {
                    fma.ax(parcel, parcel.readInt());
                }
                fma.aw(parcel, aj5);
                return new SetOwnerKeyResponse();
            case 5:
                int aj6 = fma.aj(parcel);
                while (parcel.dataPosition() < aj6) {
                    int readInt3 = parcel.readInt();
                    if (fma.af(readInt3) != 1) {
                        fma.ax(parcel, readInt3);
                    } else {
                        str6 = fma.as(parcel, readInt3);
                    }
                }
                fma.aw(parcel, aj6);
                return new StartFinderAdvertisingRequest(str6);
            case 6:
                int aj7 = fma.aj(parcel);
                while (parcel.dataPosition() < aj7) {
                    fma.ax(parcel, parcel.readInt());
                }
                fma.aw(parcel, aj7);
                return new StartFinderAdvertisingResponse();
            case 7:
                int aj8 = fma.aj(parcel);
                while (parcel.dataPosition() < aj8) {
                    int readInt4 = parcel.readInt();
                    int af3 = fma.af(readInt4);
                    if (af3 != 1) {
                        if (af3 != 5) {
                            fma.ax(parcel, readInt4);
                        } else {
                            i3 = fma.ah(parcel, readInt4);
                        }
                    } else {
                        account = (Account) fma.an(parcel, readInt4, Account.CREATOR);
                    }
                }
                fma.aw(parcel, aj8);
                return new SyncOwnerKeyRequest(account, i3);
            case 8:
                int aj9 = fma.aj(parcel);
                while (parcel.dataPosition() < aj9) {
                    fma.ax(parcel, parcel.readInt());
                }
                fma.aw(parcel, aj9);
                return new SyncOwnerKeyResponse();
            case 9:
                int aj10 = fma.aj(parcel);
                while (parcel.dataPosition() < aj10) {
                    fma.ax(parcel, parcel.readInt());
                }
                fma.aw(parcel, aj10);
                return new UnprovisionWearableDeviceResponse();
            case 10:
                int aj11 = fma.aj(parcel);
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                byte[][] bArr3 = null;
                int i4 = 0;
                int i5 = 0;
                while (parcel.dataPosition() < aj11) {
                    int readInt5 = parcel.readInt();
                    switch (fma.af(readInt5)) {
                        case 2:
                            i4 = fma.ah(parcel, readInt5);
                            break;
                        case 3:
                            i5 = fma.ah(parcel, readInt5);
                            break;
                        case 4:
                            arrayList2 = fma.au(parcel, readInt5);
                            break;
                        case 5:
                            arrayList3 = fma.at(parcel, readInt5);
                            break;
                        case 6:
                            arrayList4 = fma.au(parcel, readInt5);
                            break;
                        case 7:
                            arrayList5 = fma.at(parcel, readInt5);
                            break;
                        case 8:
                            bArr3 = fma.aD(parcel, readInt5);
                            break;
                        case 9:
                            bool = fma.ao(parcel, readInt5);
                            break;
                        default:
                            fma.ax(parcel, readInt5);
                            break;
                    }
                }
                fma.aw(parcel, aj11);
                return new FRDProductSpecificDataEntry(i4, i5, arrayList2, arrayList3, arrayList4, arrayList5, bArr3, bool.booleanValue());
            case 11:
                int aj12 = fma.aj(parcel);
                GoogleHelp googleHelp = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                int i6 = 0;
                int i7 = 0;
                while (parcel.dataPosition() < aj12) {
                    int readInt6 = parcel.readInt();
                    switch (fma.af(readInt6)) {
                        case 1:
                            googleHelp = (GoogleHelp) fma.an(parcel, readInt6, GoogleHelp.CREATOR);
                            break;
                        case 2:
                            str7 = fma.as(parcel, readInt6);
                            break;
                        case 3:
                            str8 = fma.as(parcel, readInt6);
                            break;
                        case 4:
                            i6 = fma.ah(parcel, readInt6);
                            break;
                        case 5:
                            str9 = fma.as(parcel, readInt6);
                            break;
                        case 6:
                            i7 = fma.ah(parcel, readInt6);
                            break;
                        case 7:
                            str10 = fma.as(parcel, readInt6);
                            break;
                        default:
                            fma.ax(parcel, readInt6);
                            break;
                    }
                }
                fma.aw(parcel, aj12);
                return new InProductHelp(googleHelp, str7, str8, i6, str9, i7, str10);
            case 12:
                int aj13 = fma.aj(parcel);
                while (parcel.dataPosition() < aj13) {
                    int readInt7 = parcel.readInt();
                    int af4 = fma.af(readInt7);
                    if (af4 != 2) {
                        if (af4 != 3) {
                            fma.ax(parcel, readInt7);
                        } else {
                            str5 = fma.as(parcel, readInt7);
                        }
                    } else {
                        z2 = fma.ay(parcel, readInt7);
                    }
                }
                fma.aw(parcel, aj13);
                return new ND4CSettings(z2, str5);
            case 13:
                int aj14 = fma.aj(parcel);
                String str11 = null;
                String str12 = null;
                String str13 = null;
                while (parcel.dataPosition() < aj14) {
                    int readInt8 = parcel.readInt();
                    int af5 = fma.af(readInt8);
                    if (af5 != 2) {
                        if (af5 != 3) {
                            if (af5 != 4) {
                                if (af5 != 5) {
                                    fma.ax(parcel, readInt8);
                                } else {
                                    str12 = fma.as(parcel, readInt8);
                                }
                            } else {
                                str13 = fma.as(parcel, readInt8);
                            }
                        } else {
                            str11 = fma.as(parcel, readInt8);
                        }
                    } else {
                        str4 = fma.as(parcel, readInt8);
                    }
                }
                fma.aw(parcel, aj14);
                return new OfflineSuggestion(str4, str11, str12, str13);
            case 14:
                int aj15 = fma.aj(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < aj15) {
                    int readInt9 = parcel.readInt();
                    int af6 = fma.af(readInt9);
                    if (af6 != 2) {
                        if (af6 != 3) {
                            if (af6 != 4) {
                                fma.ax(parcel, readInt9);
                            } else {
                                intent = (Intent) fma.an(parcel, readInt9, Intent.CREATOR);
                            }
                        } else {
                            str3 = fma.as(parcel, readInt9);
                        }
                    } else {
                        i2 = fma.ah(parcel, readInt9);
                    }
                }
                fma.aw(parcel, aj15);
                return new OverflowMenuItem(i2, str3, intent);
            case 15:
                int aj16 = fma.aj(parcel);
                String str14 = null;
                String str15 = null;
                while (parcel.dataPosition() < aj16) {
                    int readInt10 = parcel.readInt();
                    int af7 = fma.af(readInt10);
                    if (af7 != 2) {
                        if (af7 != 3) {
                            if (af7 != 4) {
                                fma.ax(parcel, readInt10);
                            } else {
                                str15 = fma.as(parcel, readInt10);
                            }
                        } else {
                            str14 = fma.as(parcel, readInt10);
                        }
                    } else {
                        str2 = fma.as(parcel, readInt10);
                    }
                }
                fma.aw(parcel, aj16);
                return new TogglingData(str2, str14, str15);
            case 16:
                int aj17 = fma.aj(parcel);
                String str16 = "";
                long j = 0;
                while (parcel.dataPosition() < aj17) {
                    int readInt11 = parcel.readInt();
                    int af8 = fma.af(readInt11);
                    if (af8 != 1) {
                        if (af8 != 2) {
                            if (af8 != 3) {
                                fma.ax(parcel, readInt11);
                            } else {
                                str16 = fma.as(parcel, readInt11);
                            }
                        } else {
                            j = fma.ak(parcel, readInt11);
                        }
                    } else {
                        str = fma.as(parcel, readInt11);
                    }
                }
                fma.aw(parcel, aj17);
                return new TrailsInteraction(str, j, str16);
            case 17:
                int aj18 = fma.aj(parcel);
                String str17 = null;
                String str18 = null;
                String str19 = null;
                ArrayList arrayList6 = null;
                ClientIdentity clientIdentity = null;
                int i8 = 0;
                while (parcel.dataPosition() < aj18) {
                    int readInt12 = parcel.readInt();
                    int af9 = fma.af(readInt12);
                    if (af9 != 1) {
                        if (af9 != 3) {
                            if (af9 != 4) {
                                if (af9 != 6) {
                                    if (af9 != 7) {
                                        if (af9 != 8) {
                                            fma.ax(parcel, readInt12);
                                        } else {
                                            arrayList6 = fma.av(parcel, readInt12, Feature.CREATOR);
                                        }
                                    } else {
                                        clientIdentity = (ClientIdentity) fma.an(parcel, readInt12, ClientIdentity.CREATOR);
                                    }
                                } else {
                                    str19 = fma.as(parcel, readInt12);
                                }
                            } else {
                                str18 = fma.as(parcel, readInt12);
                            }
                        } else {
                            str17 = fma.as(parcel, readInt12);
                        }
                    } else {
                        i8 = fma.ah(parcel, readInt12);
                    }
                }
                fma.aw(parcel, aj18);
                str17.getClass();
                return new ClientIdentity(i8, str17, str18, str19, arrayList6, clientIdentity);
            case 18:
                int aj19 = fma.aj(parcel);
                boolean z3 = false;
                while (parcel.dataPosition() < aj19) {
                    int readInt13 = parcel.readInt();
                    int af10 = fma.af(readInt13);
                    if (af10 != 1) {
                        if (af10 != 2) {
                            if (af10 != 3) {
                                fma.ax(parcel, readInt13);
                            } else {
                                z3 = fma.ay(parcel, readInt13);
                            }
                        } else {
                            z = fma.ay(parcel, readInt13);
                        }
                    } else {
                        arrayList = fma.av(parcel, readInt13, LocationRequest.CREATOR);
                    }
                }
                fma.aw(parcel, aj19);
                return new LocationSettingsRequest(arrayList, z, z3);
            case 19:
                int aj20 = fma.aj(parcel);
                LocationSettingsStates locationSettingsStates = null;
                while (parcel.dataPosition() < aj20) {
                    int readInt14 = parcel.readInt();
                    int af11 = fma.af(readInt14);
                    if (af11 != 1) {
                        if (af11 != 2) {
                            fma.ax(parcel, readInt14);
                        } else {
                            locationSettingsStates = (LocationSettingsStates) fma.an(parcel, readInt14, LocationSettingsStates.CREATOR);
                        }
                    } else {
                        status = (Status) fma.an(parcel, readInt14, Status.CREATOR);
                    }
                }
                fma.aw(parcel, aj20);
                return new LocationSettingsResult(status, locationSettingsStates);
            default:
                int aj21 = fma.aj(parcel);
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                while (parcel.dataPosition() < aj21) {
                    int readInt15 = parcel.readInt();
                    switch (fma.af(readInt15)) {
                        case 1:
                            z4 = fma.ay(parcel, readInt15);
                            break;
                        case 2:
                            z5 = fma.ay(parcel, readInt15);
                            break;
                        case 3:
                            z6 = fma.ay(parcel, readInt15);
                            break;
                        case 4:
                            z7 = fma.ay(parcel, readInt15);
                            break;
                        case 5:
                            z8 = fma.ay(parcel, readInt15);
                            break;
                        case 6:
                            z9 = fma.ay(parcel, readInt15);
                            break;
                        default:
                            fma.ax(parcel, readInt15);
                            break;
                    }
                }
                fma.aw(parcel, aj21);
                return new LocationSettingsStates(z4, z5, z6, z7, z8, z9);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ServiceDump[i];
            case 1:
                return new OwnersLocationReportResponse[i];
            case 2:
                return new ProvisionWearableDeviceResponse[i];
            case 3:
                return new ScanResult[i];
            case 4:
                return new SetOwnerKeyResponse[i];
            case 5:
                return new StartFinderAdvertisingRequest[i];
            case 6:
                return new StartFinderAdvertisingResponse[i];
            case 7:
                return new SyncOwnerKeyRequest[i];
            case 8:
                return new SyncOwnerKeyResponse[i];
            case 9:
                return new UnprovisionWearableDeviceResponse[i];
            case 10:
                return new FRDProductSpecificDataEntry[i];
            case 11:
                return new InProductHelp[i];
            case 12:
                return new ND4CSettings[i];
            case 13:
                return new OfflineSuggestion[i];
            case 14:
                return new OverflowMenuItem[i];
            case 15:
                return new TogglingData[i];
            case 16:
                return new TrailsInteraction[i];
            case 17:
                return new ClientIdentity[i];
            case 18:
                return new LocationSettingsRequest[i];
            case 19:
                return new LocationSettingsResult[i];
            default:
                return new LocationSettingsStates[i];
        }
    }
}
