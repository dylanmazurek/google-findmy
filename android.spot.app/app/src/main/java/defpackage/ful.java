package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.uwb.internal.DlTdoaMeasurementParams;
import com.google.android.gms.nearby.uwb.internal.GetRangingCapabilitiesParams;
import com.google.android.gms.nearby.uwb.internal.IsAvailableParams;
import com.google.android.gms.nearby.uwb.internal.OnPeerDisconnectedParams;
import com.google.android.gms.nearby.uwb.internal.OnRangingInitializedParams;
import com.google.android.gms.nearby.uwb.internal.OnRangingResultParams;
import com.google.android.gms.nearby.uwb.internal.OnRangingSuspendedParams;
import com.google.android.gms.nearby.uwb.internal.RangeDataNtfConfigParams;
import com.google.android.gms.nearby.uwb.internal.RangingCapabilitiesParams;
import com.google.android.gms.nearby.uwb.internal.RangingMeasurementParams;
import com.google.android.gms.nearby.uwb.internal.RangingParametersParams;
import com.google.android.gms.nearby.uwb.internal.RangingPositionParams;
import com.google.android.gms.nearby.uwb.internal.StartRangingParams;
import com.google.android.gms.nearby.uwb.internal.StopRangingParams;
import com.google.android.gms.nearby.uwb.internal.UwbAddressParams;
import com.google.android.gms.nearby.uwb.internal.UwbComplexChannelParams;
import com.google.android.gms.nearby.uwb.internal.UwbDeviceParams;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeResult;
import com.google.android.gms.people.consentprimitive.ContactsConsentsCoarseStatus;
import com.google.android.gms.people.consentprimitive.ContactsConsentsConfig;
import com.google.android.gms.people.consentprimitive.ContactsConsentsDetailedStatus;
import com.google.android.gms.people.consentprimitive.ContactsConsentsStatus;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ful implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ful(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        float f = 0.0f;
        int i = 0;
        IBinder iBinder = null;
        ContactsConsentsCoarseStatus contactsConsentsCoarseStatus = null;
        Bundle bundle = null;
        String str = null;
        UwbAddressParams uwbAddressParams = null;
        byte[] bArr = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        UwbDeviceParams uwbDeviceParams = null;
        UwbDeviceParams uwbDeviceParams2 = null;
        UwbDeviceParams uwbDeviceParams3 = null;
        UwbDeviceParams uwbDeviceParams4 = null;
        IBinder iBinder4 = null;
        switch (this.a) {
            case 0:
                int aj = fma.aj(parcel);
                while (parcel.dataPosition() < aj) {
                    int readInt = parcel.readInt();
                    if (fma.af(readInt) != 1) {
                        fma.ax(parcel, readInt);
                    } else {
                        iBinder = fma.am(parcel, readInt);
                    }
                }
                fma.aw(parcel, aj);
                return new IsAvailableParams(iBinder);
            case 1:
                int aj2 = fma.aj(parcel);
                while (parcel.dataPosition() < aj2) {
                    int readInt2 = parcel.readInt();
                    if (fma.af(readInt2) != 1) {
                        fma.ax(parcel, readInt2);
                    } else {
                        iBinder4 = fma.am(parcel, readInt2);
                    }
                }
                fma.aw(parcel, aj2);
                return new GetRangingCapabilitiesParams(iBinder4);
            case 2:
                int aj3 = fma.aj(parcel);
                while (parcel.dataPosition() < aj3) {
                    int readInt3 = parcel.readInt();
                    int af = fma.af(readInt3);
                    if (af != 1) {
                        if (af != 2) {
                            fma.ax(parcel, readInt3);
                        } else {
                            i = fma.ah(parcel, readInt3);
                        }
                    } else {
                        uwbDeviceParams4 = (UwbDeviceParams) fma.an(parcel, readInt3, UwbDeviceParams.CREATOR);
                    }
                }
                fma.aw(parcel, aj3);
                return new OnPeerDisconnectedParams(uwbDeviceParams4, i);
            case 3:
                int aj4 = fma.aj(parcel);
                while (parcel.dataPosition() < aj4) {
                    int readInt4 = parcel.readInt();
                    if (fma.af(readInt4) != 1) {
                        fma.ax(parcel, readInt4);
                    } else {
                        uwbDeviceParams3 = (UwbDeviceParams) fma.an(parcel, readInt4, UwbDeviceParams.CREATOR);
                    }
                }
                fma.aw(parcel, aj4);
                return new OnRangingInitializedParams(uwbDeviceParams3);
            case 4:
                int aj5 = fma.aj(parcel);
                RangingPositionParams rangingPositionParams = null;
                while (parcel.dataPosition() < aj5) {
                    int readInt5 = parcel.readInt();
                    int af2 = fma.af(readInt5);
                    if (af2 != 1) {
                        if (af2 != 2) {
                            fma.ax(parcel, readInt5);
                        } else {
                            rangingPositionParams = (RangingPositionParams) fma.an(parcel, readInt5, RangingPositionParams.CREATOR);
                        }
                    } else {
                        uwbDeviceParams2 = (UwbDeviceParams) fma.an(parcel, readInt5, UwbDeviceParams.CREATOR);
                    }
                }
                fma.aw(parcel, aj5);
                return new OnRangingResultParams(uwbDeviceParams2, rangingPositionParams);
            case 5:
                int aj6 = fma.aj(parcel);
                while (parcel.dataPosition() < aj6) {
                    int readInt6 = parcel.readInt();
                    int af3 = fma.af(readInt6);
                    if (af3 != 1) {
                        if (af3 != 2) {
                            fma.ax(parcel, readInt6);
                        } else {
                            i = fma.ah(parcel, readInt6);
                        }
                    } else {
                        uwbDeviceParams = (UwbDeviceParams) fma.an(parcel, readInt6, UwbDeviceParams.CREATOR);
                    }
                }
                fma.aw(parcel, aj6);
                return new OnRangingSuspendedParams(uwbDeviceParams, i);
            case 6:
                int aj7 = fma.aj(parcel);
                int i2 = 0;
                int i3 = 0;
                while (parcel.dataPosition() < aj7) {
                    int readInt7 = parcel.readInt();
                    int af4 = fma.af(readInt7);
                    if (af4 != 1) {
                        if (af4 != 2) {
                            if (af4 != 3) {
                                fma.ax(parcel, readInt7);
                            } else {
                                i3 = fma.ah(parcel, readInt7);
                            }
                        } else {
                            i2 = fma.ah(parcel, readInt7);
                        }
                    } else {
                        i = fma.ah(parcel, readInt7);
                    }
                }
                fma.aw(parcel, aj7);
                return new RangeDataNtfConfigParams(i, i2, i3);
            case 7:
                int aj8 = fma.aj(parcel);
                int[] iArr = null;
                int[] iArr2 = null;
                int[] iArr3 = null;
                int[] iArr4 = null;
                int[] iArr5 = null;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                int i4 = 0;
                int i5 = 0;
                float f2 = 0.0f;
                boolean z4 = false;
                boolean z5 = false;
                while (parcel.dataPosition() < aj8) {
                    int readInt8 = parcel.readInt();
                    switch (fma.af(readInt8)) {
                        case 1:
                            z = fma.ay(parcel, readInt8);
                            break;
                        case 2:
                            z2 = fma.ay(parcel, readInt8);
                            break;
                        case 3:
                            z3 = fma.ay(parcel, readInt8);
                            break;
                        case 4:
                            i4 = fma.ah(parcel, readInt8);
                            break;
                        case 5:
                            i5 = fma.ah(parcel, readInt8);
                            break;
                        case 6:
                            iArr = fma.aA(parcel, readInt8);
                            break;
                        case 7:
                            iArr2 = fma.aA(parcel, readInt8);
                            break;
                        case 8:
                            f2 = fma.ae(parcel, readInt8);
                            break;
                        case 9:
                            iArr3 = fma.aA(parcel, readInt8);
                            break;
                        case 10:
                            iArr4 = fma.aA(parcel, readInt8);
                            break;
                        case 11:
                            iArr5 = fma.aA(parcel, readInt8);
                            break;
                        case 12:
                            z4 = fma.ay(parcel, readInt8);
                            break;
                        case 13:
                            z5 = fma.ay(parcel, readInt8);
                            break;
                        default:
                            fma.ax(parcel, readInt8);
                            break;
                    }
                }
                fma.aw(parcel, aj8);
                return new RangingCapabilitiesParams(z, z2, z3, i4, i5, iArr, iArr2, f2, iArr3, iArr4, iArr5, z4, z5);
            case 8:
                int aj9 = fma.aj(parcel);
                while (parcel.dataPosition() < aj9) {
                    int readInt9 = parcel.readInt();
                    int af5 = fma.af(readInt9);
                    if (af5 != 1) {
                        if (af5 != 2) {
                            fma.ax(parcel, readInt9);
                        } else {
                            f = fma.ae(parcel, readInt9);
                        }
                    } else {
                        i = fma.ah(parcel, readInt9);
                    }
                }
                fma.aw(parcel, aj9);
                return new RangingMeasurementParams(i, f);
            case 9:
                int aj10 = fma.aj(parcel);
                byte[] bArr2 = null;
                UwbComplexChannelParams uwbComplexChannelParams = null;
                UwbDeviceParams[] uwbDeviceParamsArr = null;
                byte[] bArr3 = null;
                UwbDeviceParams uwbDeviceParams5 = null;
                RangeDataNtfConfigParams rangeDataNtfConfigParams = null;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                boolean z6 = false;
                while (parcel.dataPosition() < aj10) {
                    int readInt10 = parcel.readInt();
                    switch (fma.af(readInt10)) {
                        case 1:
                            i6 = fma.ah(parcel, readInt10);
                            break;
                        case 2:
                            i7 = fma.ah(parcel, readInt10);
                            break;
                        case 3:
                            bArr2 = fma.az(parcel, readInt10);
                            break;
                        case 4:
                            uwbComplexChannelParams = (UwbComplexChannelParams) fma.an(parcel, readInt10, UwbComplexChannelParams.CREATOR);
                            break;
                        case 5:
                            i8 = fma.ah(parcel, readInt10);
                            break;
                        case 6:
                            uwbDeviceParamsArr = (UwbDeviceParams[]) fma.aB(parcel, readInt10, UwbDeviceParams.CREATOR);
                            break;
                        case 7:
                            i9 = fma.ah(parcel, readInt10);
                            break;
                        case 8:
                            bArr3 = fma.az(parcel, readInt10);
                            break;
                        case 9:
                            uwbDeviceParams5 = (UwbDeviceParams) fma.an(parcel, readInt10, UwbDeviceParams.CREATOR);
                            break;
                        case 10:
                            rangeDataNtfConfigParams = (RangeDataNtfConfigParams) fma.an(parcel, readInt10, RangeDataNtfConfigParams.CREATOR);
                            break;
                        case 11:
                            i10 = fma.ah(parcel, readInt10);
                            break;
                        case 12:
                            i11 = fma.ah(parcel, readInt10);
                            break;
                        case 13:
                            z6 = fma.ay(parcel, readInt10);
                            break;
                        default:
                            fma.ax(parcel, readInt10);
                            break;
                    }
                }
                fma.aw(parcel, aj10);
                return new RangingParametersParams(i6, i7, bArr2, uwbComplexChannelParams, i8, uwbDeviceParamsArr, i9, bArr3, uwbDeviceParams5, rangeDataNtfConfigParams, i10, i11, z6);
            case 10:
                int aj11 = fma.aj(parcel);
                long j = 0;
                RangingMeasurementParams rangingMeasurementParams = null;
                RangingMeasurementParams rangingMeasurementParams2 = null;
                RangingMeasurementParams rangingMeasurementParams3 = null;
                DlTdoaMeasurementParams dlTdoaMeasurementParams = null;
                int i12 = -128;
                while (parcel.dataPosition() < aj11) {
                    int readInt11 = parcel.readInt();
                    switch (fma.af(readInt11)) {
                        case 1:
                            rangingMeasurementParams = (RangingMeasurementParams) fma.an(parcel, readInt11, RangingMeasurementParams.CREATOR);
                            break;
                        case 2:
                            rangingMeasurementParams2 = (RangingMeasurementParams) fma.an(parcel, readInt11, RangingMeasurementParams.CREATOR);
                            break;
                        case 3:
                            rangingMeasurementParams3 = (RangingMeasurementParams) fma.an(parcel, readInt11, RangingMeasurementParams.CREATOR);
                            break;
                        case 4:
                            j = fma.ak(parcel, readInt11);
                            break;
                        case 5:
                            i12 = fma.ah(parcel, readInt11);
                            break;
                        case 6:
                            dlTdoaMeasurementParams = (DlTdoaMeasurementParams) fma.an(parcel, readInt11, DlTdoaMeasurementParams.CREATOR);
                            break;
                        default:
                            fma.ax(parcel, readInt11);
                            break;
                    }
                }
                fma.aw(parcel, aj11);
                return new RangingPositionParams(rangingMeasurementParams, rangingMeasurementParams2, rangingMeasurementParams3, j, i12, dlTdoaMeasurementParams);
            case 11:
                int aj12 = fma.aj(parcel);
                RangingParametersParams rangingParametersParams = null;
                IBinder iBinder5 = null;
                while (parcel.dataPosition() < aj12) {
                    int readInt12 = parcel.readInt();
                    int af6 = fma.af(readInt12);
                    if (af6 != 1) {
                        if (af6 != 2) {
                            if (af6 != 3) {
                                fma.ax(parcel, readInt12);
                            } else {
                                iBinder5 = fma.am(parcel, readInt12);
                            }
                        } else {
                            rangingParametersParams = (RangingParametersParams) fma.an(parcel, readInt12, RangingParametersParams.CREATOR);
                        }
                    } else {
                        iBinder3 = fma.am(parcel, readInt12);
                    }
                }
                fma.aw(parcel, aj12);
                return new StartRangingParams(iBinder3, rangingParametersParams, iBinder5);
            case 12:
                int aj13 = fma.aj(parcel);
                while (parcel.dataPosition() < aj13) {
                    int readInt13 = parcel.readInt();
                    if (fma.af(readInt13) != 1) {
                        fma.ax(parcel, readInt13);
                    } else {
                        iBinder2 = fma.am(parcel, readInt13);
                    }
                }
                fma.aw(parcel, aj13);
                return new StopRangingParams(iBinder2);
            case 13:
                int aj14 = fma.aj(parcel);
                while (parcel.dataPosition() < aj14) {
                    int readInt14 = parcel.readInt();
                    int af7 = fma.af(readInt14);
                    if (af7 != 1) {
                        if (af7 != 2) {
                            fma.ax(parcel, readInt14);
                        } else {
                            i = fma.ah(parcel, readInt14);
                        }
                    } else {
                        bArr = fma.az(parcel, readInt14);
                    }
                }
                fma.aw(parcel, aj14);
                return new UwbAddressParams(bArr, i);
            case 14:
                int aj15 = fma.aj(parcel);
                int i13 = 0;
                int i14 = 0;
                while (parcel.dataPosition() < aj15) {
                    int readInt15 = parcel.readInt();
                    int af8 = fma.af(readInt15);
                    if (af8 != 1) {
                        if (af8 != 2) {
                            if (af8 != 3) {
                                fma.ax(parcel, readInt15);
                            } else {
                                i14 = fma.ah(parcel, readInt15);
                            }
                        } else {
                            i13 = fma.ah(parcel, readInt15);
                        }
                    } else {
                        i = fma.ah(parcel, readInt15);
                    }
                }
                fma.aw(parcel, aj15);
                return new UwbComplexChannelParams(i, i13, i14);
            case 15:
                int aj16 = fma.aj(parcel);
                while (parcel.dataPosition() < aj16) {
                    int readInt16 = parcel.readInt();
                    if (fma.af(readInt16) != 1) {
                        fma.ax(parcel, readInt16);
                    } else {
                        uwbAddressParams = (UwbAddressParams) fma.an(parcel, readInt16, UwbAddressParams.CREATOR);
                    }
                }
                fma.aw(parcel, aj16);
                return new UwbDeviceParams(uwbAddressParams);
            case 16:
                int aj17 = fma.aj(parcel);
                String str2 = null;
                int i15 = 0;
                while (parcel.dataPosition() < aj17) {
                    int readInt17 = parcel.readInt();
                    int af9 = fma.af(readInt17);
                    if (af9 != 1) {
                        if (af9 != 2) {
                            if (af9 != 3) {
                                if (af9 != 4) {
                                    fma.ax(parcel, readInt17);
                                } else {
                                    i15 = fma.ah(parcel, readInt17);
                                }
                            } else {
                                i = fma.ah(parcel, readInt17);
                            }
                        } else {
                            str2 = fma.as(parcel, readInt17);
                        }
                    } else {
                        str = fma.as(parcel, readInt17);
                    }
                }
                fma.aw(parcel, aj17);
                return new ClassifyAccountTypeResult(str, str2, i, i15);
            case 17:
                int aj18 = fma.aj(parcel);
                String str3 = "";
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                while (parcel.dataPosition() < aj18) {
                    int readInt18 = parcel.readInt();
                    switch (fma.af(readInt18)) {
                        case 1:
                            z7 = fma.ay(parcel, readInt18);
                            break;
                        case 2:
                            z8 = fma.ay(parcel, readInt18);
                            break;
                        case 3:
                            arrayList = fma.av(parcel, readInt18, Account.CREATOR);
                            break;
                        case 4:
                            arrayList2 = fma.av(parcel, readInt18, Account.CREATOR);
                            break;
                        case 5:
                            str3 = fma.as(parcel, readInt18);
                            break;
                        case 6:
                            z9 = fma.ay(parcel, readInt18);
                            break;
                        case 7:
                            arrayList3 = fma.av(parcel, readInt18, Account.CREATOR);
                            break;
                        default:
                            fma.ax(parcel, readInt18);
                            break;
                    }
                }
                fma.aw(parcel, aj18);
                return new ContactsConsentsCoarseStatus(z7, z8, arrayList, arrayList2, str3, z9, arrayList3);
            case 18:
                int aj19 = fma.aj(parcel);
                Account account = null;
                String str4 = null;
                ArrayList arrayList4 = null;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                while (parcel.dataPosition() < aj19) {
                    int readInt19 = parcel.readInt();
                    switch (fma.af(readInt19)) {
                        case 1:
                            z10 = fma.ay(parcel, readInt19);
                            break;
                        case 2:
                            z11 = fma.ay(parcel, readInt19);
                            break;
                        case 3:
                            z12 = fma.ay(parcel, readInt19);
                            break;
                        case 4:
                            account = (Account) fma.an(parcel, readInt19, Account.CREATOR);
                            break;
                        case 5:
                            z13 = fma.ay(parcel, readInt19);
                            break;
                        case 6:
                            z14 = fma.ay(parcel, readInt19);
                            break;
                        case 7:
                            str4 = fma.as(parcel, readInt19);
                            break;
                        case 8:
                            arrayList4 = fma.av(parcel, readInt19, Account.CREATOR);
                            break;
                        case 9:
                            z15 = fma.ay(parcel, readInt19);
                            break;
                        default:
                            fma.ax(parcel, readInt19);
                            break;
                    }
                }
                fma.aw(parcel, aj19);
                return new ContactsConsentsConfig(z10, z11, z12, account, z13, z14, str4, arrayList4, z15);
            case 19:
                int aj20 = fma.aj(parcel);
                while (parcel.dataPosition() < aj20) {
                    int readInt20 = parcel.readInt();
                    int af10 = fma.af(readInt20);
                    if (af10 != 1) {
                        if (af10 != 2) {
                            fma.ax(parcel, readInt20);
                        } else {
                            bundle = fma.al(parcel, readInt20);
                        }
                    } else {
                        i = fma.ah(parcel, readInt20);
                    }
                }
                fma.aw(parcel, aj20);
                return new ContactsConsentsDetailedStatus(i, bundle);
            default:
                int aj21 = fma.aj(parcel);
                ContactsConsentsDetailedStatus contactsConsentsDetailedStatus = null;
                ContactsConsentsConfig contactsConsentsConfig = null;
                while (parcel.dataPosition() < aj21) {
                    int readInt21 = parcel.readInt();
                    int af11 = fma.af(readInt21);
                    if (af11 != 1) {
                        if (af11 != 2) {
                            if (af11 != 3) {
                                fma.ax(parcel, readInt21);
                            } else {
                                contactsConsentsConfig = (ContactsConsentsConfig) fma.an(parcel, readInt21, ContactsConsentsConfig.CREATOR);
                            }
                        } else {
                            contactsConsentsDetailedStatus = (ContactsConsentsDetailedStatus) fma.an(parcel, readInt21, ContactsConsentsDetailedStatus.CREATOR);
                        }
                    } else {
                        contactsConsentsCoarseStatus = (ContactsConsentsCoarseStatus) fma.an(parcel, readInt21, ContactsConsentsCoarseStatus.CREATOR);
                    }
                }
                fma.aw(parcel, aj21);
                return new ContactsConsentsStatus(contactsConsentsCoarseStatus, contactsConsentsDetailedStatus, contactsConsentsConfig);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new IsAvailableParams[i];
            case 1:
                return new GetRangingCapabilitiesParams[i];
            case 2:
                return new OnPeerDisconnectedParams[i];
            case 3:
                return new OnRangingInitializedParams[i];
            case 4:
                return new OnRangingResultParams[i];
            case 5:
                return new OnRangingSuspendedParams[i];
            case 6:
                return new RangeDataNtfConfigParams[i];
            case 7:
                return new RangingCapabilitiesParams[i];
            case 8:
                return new RangingMeasurementParams[i];
            case 9:
                return new RangingParametersParams[i];
            case 10:
                return new RangingPositionParams[i];
            case 11:
                return new StartRangingParams[i];
            case 12:
                return new StopRangingParams[i];
            case 13:
                return new UwbAddressParams[i];
            case 14:
                return new UwbComplexChannelParams[i];
            case 15:
                return new UwbDeviceParams[i];
            case 16:
                return new ClassifyAccountTypeResult[i];
            case 17:
                return new ContactsConsentsCoarseStatus[i];
            case 18:
                return new ContactsConsentsConfig[i];
            case 19:
                return new ContactsConsentsDetailedStatus[i];
            default:
                return new ContactsConsentsStatus[i];
        }
    }
}
