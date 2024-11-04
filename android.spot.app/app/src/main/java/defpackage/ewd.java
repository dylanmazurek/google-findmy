package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.audit.LogAuditRecordsRequest;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.DataCollectionIdentifierParcelable;
import com.google.android.gms.clearcut.internal.LogErrorParcelable;
import com.google.android.gms.clearcut.internal.LogVerifierResultParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleCertificatesLookupQuery;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewd implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ewd(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        String str = null;
        String str2 = null;
        Intent intent = null;
        ArrayList arrayList = null;
        String str3 = null;
        switch (this.a) {
            case 0:
                String n = ivc.n(fma.bC(parcel));
                eyt eytVar = ewe.c;
                byte[] bF = fma.bF(parcel);
                try {
                    Object obj2 = eytVar.b;
                    lja ljaVar = lja.a;
                    lkz lkzVar = lkz.a;
                    ljn m = ljn.m(lqd.d, bF, 0, bF.length, lja.a);
                    ljn.A(m);
                    obj = (lqd) m;
                } catch (ljy unused) {
                    obj = eytVar.a;
                }
                return new ewe(n, (lqd) obj);
            case 1:
                return new esy(parcel);
            case 2:
                return new fan(parcel);
            case 3:
                return new fap(parcel);
            case 4:
                return new far(parcel);
            case 5:
                int aj = fma.aj(parcel);
                String str4 = null;
                byte[][] bArr = null;
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                int i6 = 0;
                int i7 = 0;
                while (parcel.dataPosition() < aj) {
                    int readInt = parcel.readInt();
                    switch (fma.af(readInt)) {
                        case 1:
                            i6 = fma.ah(parcel, readInt);
                            break;
                        case 2:
                            i7 = fma.ah(parcel, readInt);
                            break;
                        case 3:
                            str4 = fma.as(parcel, readInt);
                            break;
                        case 4:
                            bArr = fma.aD(parcel, readInt);
                            break;
                        case 5:
                            bArr2 = fma.az(parcel, readInt);
                            break;
                        case 6:
                            bArr3 = fma.az(parcel, readInt);
                            break;
                        default:
                            fma.ax(parcel, readInt);
                            break;
                    }
                }
                fma.aw(parcel, aj);
                return new LogAuditRecordsRequest(i6, i7, str4, bArr, bArr2, bArr3);
            case 6:
                int aj2 = fma.aj(parcel);
                String[] strArr = null;
                while (parcel.dataPosition() < aj2) {
                    int readInt2 = parcel.readInt();
                    int af = fma.af(readInt2);
                    if (af != 1) {
                        if (af != 2) {
                            fma.ax(parcel, readInt2);
                        } else {
                            strArr = fma.aC(parcel, readInt2);
                        }
                    } else {
                        str = fma.as(parcel, readInt2);
                    }
                }
                fma.aw(parcel, aj2);
                return new GetAccountsRequest(str, strArr);
            case 7:
                int aj3 = fma.aj(parcel);
                String str5 = null;
                Long l = null;
                ArrayList arrayList2 = null;
                String str6 = null;
                int i8 = 0;
                boolean z2 = false;
                boolean z3 = false;
                while (parcel.dataPosition() < aj3) {
                    int readInt3 = parcel.readInt();
                    switch (fma.af(readInt3)) {
                        case 1:
                            i8 = fma.ah(parcel, readInt3);
                            break;
                        case 2:
                            str5 = fma.as(parcel, readInt3);
                            break;
                        case 3:
                            l = fma.ar(parcel, readInt3);
                            break;
                        case 4:
                            z2 = fma.ay(parcel, readInt3);
                            break;
                        case 5:
                            z3 = fma.ay(parcel, readInt3);
                            break;
                        case 6:
                            arrayList2 = fma.au(parcel, readInt3);
                            break;
                        case 7:
                            str6 = fma.as(parcel, readInt3);
                            break;
                        default:
                            fma.ax(parcel, readInt3);
                            break;
                    }
                }
                fma.aw(parcel, aj3);
                return new TokenData(i8, str5, l, z2, z3, arrayList2, str6);
            case 8:
                int aj4 = fma.aj(parcel);
                long j = 0;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                Uri uri = null;
                String str11 = null;
                String str12 = null;
                ArrayList arrayList3 = null;
                String str13 = null;
                String str14 = null;
                while (parcel.dataPosition() < aj4) {
                    int readInt4 = parcel.readInt();
                    switch (fma.af(readInt4)) {
                        case 2:
                            str7 = fma.as(parcel, readInt4);
                            break;
                        case 3:
                            str8 = fma.as(parcel, readInt4);
                            break;
                        case 4:
                            str9 = fma.as(parcel, readInt4);
                            break;
                        case 5:
                            str10 = fma.as(parcel, readInt4);
                            break;
                        case 6:
                            uri = (Uri) fma.an(parcel, readInt4, Uri.CREATOR);
                            break;
                        case 7:
                            str11 = fma.as(parcel, readInt4);
                            break;
                        case 8:
                            j = fma.ak(parcel, readInt4);
                            break;
                        case 9:
                            str12 = fma.as(parcel, readInt4);
                            break;
                        case 10:
                            arrayList3 = fma.av(parcel, readInt4, Scope.CREATOR);
                            break;
                        case 11:
                            str13 = fma.as(parcel, readInt4);
                            break;
                        case 12:
                            str14 = fma.as(parcel, readInt4);
                            break;
                        default:
                            fma.ax(parcel, readInt4);
                            break;
                    }
                }
                fma.aw(parcel, aj4);
                return new GoogleSignInAccount(str7, str8, str9, str10, uri, str11, j, str12, arrayList3, str13, str14);
            case 9:
                int aj5 = fma.aj(parcel);
                while (parcel.dataPosition() < aj5) {
                    int readInt5 = parcel.readInt();
                    int af2 = fma.af(readInt5);
                    if (af2 != 1) {
                        if (af2 != 2) {
                            fma.ax(parcel, readInt5);
                        } else {
                            str3 = fma.as(parcel, readInt5);
                        }
                    } else {
                        i = fma.ah(parcel, readInt5);
                    }
                }
                fma.aw(parcel, aj5);
                return new ClearTokenRequest(i, str3);
            case 10:
                int aj6 = fma.aj(parcel);
                PlayLoggerContext playLoggerContext = null;
                byte[] bArr4 = null;
                int[] iArr = null;
                String[] strArr2 = null;
                int[] iArr2 = null;
                byte[][] bArr5 = null;
                ExperimentTokens[] experimentTokensArr = null;
                LogVerifierResultParcelable logVerifierResultParcelable = null;
                String[] strArr3 = null;
                DataCollectionIdentifierParcelable dataCollectionIdentifierParcelable = null;
                boolean z4 = true;
                int i9 = 0;
                while (parcel.dataPosition() < aj6) {
                    int readInt6 = parcel.readInt();
                    switch (fma.af(readInt6)) {
                        case 2:
                            playLoggerContext = (PlayLoggerContext) fma.an(parcel, readInt6, PlayLoggerContext.CREATOR);
                            break;
                        case 3:
                            bArr4 = fma.az(parcel, readInt6);
                            break;
                        case 4:
                            iArr = fma.aA(parcel, readInt6);
                            break;
                        case 5:
                            strArr2 = fma.aC(parcel, readInt6);
                            break;
                        case 6:
                            iArr2 = fma.aA(parcel, readInt6);
                            break;
                        case 7:
                            bArr5 = fma.aD(parcel, readInt6);
                            break;
                        case 8:
                            z4 = fma.ay(parcel, readInt6);
                            break;
                        case 9:
                            experimentTokensArr = (ExperimentTokens[]) fma.aB(parcel, readInt6, ExperimentTokens.CREATOR);
                            break;
                        case 10:
                        default:
                            fma.ax(parcel, readInt6);
                            break;
                        case 11:
                            logVerifierResultParcelable = (LogVerifierResultParcelable) fma.an(parcel, readInt6, LogVerifierResultParcelable.CREATOR);
                            break;
                        case 12:
                            strArr3 = fma.aC(parcel, readInt6);
                            break;
                        case 13:
                            i9 = fma.ah(parcel, readInt6);
                            break;
                        case 14:
                            dataCollectionIdentifierParcelable = (DataCollectionIdentifierParcelable) fma.an(parcel, readInt6, DataCollectionIdentifierParcelable.CREATOR);
                            break;
                    }
                }
                fma.aw(parcel, aj6);
                return new LogEventParcelable(playLoggerContext, bArr4, iArr, strArr2, iArr2, bArr5, z4, experimentTokensArr, logVerifierResultParcelable, strArr3, i9, dataCollectionIdentifierParcelable);
            case 11:
                int aj7 = fma.aj(parcel);
                while (parcel.dataPosition() < aj7) {
                    int readInt7 = parcel.readInt();
                    if (fma.af(readInt7) != 1) {
                        fma.ax(parcel, readInt7);
                    } else {
                        arrayList = fma.av(parcel, readInt7, LogErrorParcelable.CREATOR);
                    }
                }
                fma.aw(parcel, aj7);
                return new BatchedLogErrorParcelable(arrayList);
            case 12:
                int aj8 = fma.aj(parcel);
                int i10 = 0;
                int i11 = 0;
                while (parcel.dataPosition() < aj8) {
                    int readInt8 = parcel.readInt();
                    int af3 = fma.af(readInt8);
                    if (af3 != 1) {
                        if (af3 != 2) {
                            if (af3 != 3) {
                                fma.ax(parcel, readInt8);
                            } else {
                                i11 = fma.ah(parcel, readInt8);
                            }
                        } else {
                            i10 = fma.ah(parcel, readInt8);
                        }
                    } else {
                        i5 = fma.ah(parcel, readInt8);
                    }
                }
                fma.aw(parcel, aj8);
                return new DataCollectionIdentifierParcelable(i5, i10, i11);
            case 13:
                int aj9 = fma.aj(parcel);
                String str15 = null;
                int i12 = 0;
                while (parcel.dataPosition() < aj9) {
                    int readInt9 = parcel.readInt();
                    int af4 = fma.af(readInt9);
                    if (af4 != 1) {
                        if (af4 != 2) {
                            if (af4 != 3) {
                                fma.ax(parcel, readInt9);
                            } else {
                                i12 = fma.ah(parcel, readInt9);
                            }
                        } else {
                            i4 = fma.ah(parcel, readInt9);
                        }
                    } else {
                        str15 = fma.as(parcel, readInt9);
                    }
                }
                fma.aw(parcel, aj9);
                return new LogErrorParcelable(str15, i4, i12);
            case 14:
                int aj10 = fma.aj(parcel);
                while (parcel.dataPosition() < aj10) {
                    int readInt10 = parcel.readInt();
                    if (fma.af(readInt10) != 1) {
                        fma.ax(parcel, readInt10);
                    } else {
                        z = fma.ay(parcel, readInt10);
                    }
                }
                fma.aw(parcel, aj10);
                return new LogVerifierResultParcelable(z);
            case 15:
                int aj11 = fma.aj(parcel);
                String str16 = null;
                String str17 = null;
                String str18 = null;
                Integer num = null;
                int i13 = 0;
                int i14 = 0;
                boolean z5 = true;
                boolean z6 = false;
                int i15 = 0;
                boolean z7 = false;
                int i16 = 0;
                while (parcel.dataPosition() < aj11) {
                    int readInt11 = parcel.readInt();
                    switch (fma.af(readInt11)) {
                        case 2:
                            str16 = fma.as(parcel, readInt11);
                            break;
                        case 3:
                            i13 = fma.ah(parcel, readInt11);
                            break;
                        case 4:
                            i14 = fma.ah(parcel, readInt11);
                            break;
                        case 5:
                            str17 = fma.as(parcel, readInt11);
                            break;
                        case 6:
                        default:
                            fma.ax(parcel, readInt11);
                            break;
                        case 7:
                            z5 = fma.ay(parcel, readInt11);
                            break;
                        case 8:
                            str18 = fma.as(parcel, readInt11);
                            break;
                        case 9:
                            z6 = fma.ay(parcel, readInt11);
                            break;
                        case 10:
                            i15 = fma.ah(parcel, readInt11);
                            break;
                        case 11:
                            num = fma.aq(parcel, readInt11);
                            break;
                        case 12:
                            z7 = fma.ay(parcel, readInt11);
                            break;
                        case 13:
                            i16 = fma.ah(parcel, readInt11);
                            break;
                    }
                }
                fma.aw(parcel, aj11);
                return new PlayLoggerContext(str16, i13, i14, str17, z5, str18, z6, i15, num, z7, i16);
            case 16:
                int aj12 = fma.aj(parcel);
                while (parcel.dataPosition() < aj12) {
                    int readInt12 = parcel.readInt();
                    if (fma.af(readInt12) != 1) {
                        fma.ax(parcel, readInt12);
                    } else {
                        intent = (Intent) fma.an(parcel, readInt12, Intent.CREATOR);
                    }
                }
                fma.aw(parcel, aj12);
                return new CloudMessage(intent);
            case 17:
                return new CloudMessagingMessengerCompat(parcel.readStrongBinder());
            case 18:
                int aj13 = fma.aj(parcel);
                PendingIntent pendingIntent = null;
                String str19 = null;
                int i17 = 0;
                while (parcel.dataPosition() < aj13) {
                    int readInt13 = parcel.readInt();
                    int af5 = fma.af(readInt13);
                    if (af5 != 1) {
                        if (af5 != 2) {
                            if (af5 != 3) {
                                if (af5 != 4) {
                                    fma.ax(parcel, readInt13);
                                } else {
                                    str19 = fma.as(parcel, readInt13);
                                }
                            } else {
                                pendingIntent = (PendingIntent) fma.an(parcel, readInt13, PendingIntent.CREATOR);
                            }
                        } else {
                            i17 = fma.ah(parcel, readInt13);
                        }
                    } else {
                        i3 = fma.ah(parcel, readInt13);
                    }
                }
                fma.aw(parcel, aj13);
                return new ConnectionResult(i3, i17, pendingIntent, str19);
            case 19:
                int aj14 = fma.aj(parcel);
                long j2 = -1;
                while (parcel.dataPosition() < aj14) {
                    int readInt14 = parcel.readInt();
                    int af6 = fma.af(readInt14);
                    if (af6 != 1) {
                        if (af6 != 2) {
                            if (af6 != 3) {
                                fma.ax(parcel, readInt14);
                            } else {
                                j2 = fma.ak(parcel, readInt14);
                            }
                        } else {
                            i2 = fma.ah(parcel, readInt14);
                        }
                    } else {
                        str2 = fma.as(parcel, readInt14);
                    }
                }
                fma.aw(parcel, aj14);
                return new Feature(str2, i2, j2);
            default:
                int aj15 = fma.aj(parcel);
                String str20 = null;
                IBinder iBinder = null;
                boolean z8 = false;
                boolean z9 = false;
                boolean z10 = false;
                boolean z11 = false;
                while (parcel.dataPosition() < aj15) {
                    int readInt15 = parcel.readInt();
                    switch (fma.af(readInt15)) {
                        case 1:
                            str20 = fma.as(parcel, readInt15);
                            break;
                        case 2:
                            z8 = fma.ay(parcel, readInt15);
                            break;
                        case 3:
                            z9 = fma.ay(parcel, readInt15);
                            break;
                        case 4:
                            iBinder = fma.am(parcel, readInt15);
                            break;
                        case 5:
                            z10 = fma.ay(parcel, readInt15);
                            break;
                        case 6:
                            z11 = fma.ay(parcel, readInt15);
                            break;
                        default:
                            fma.ax(parcel, readInt15);
                            break;
                    }
                }
                fma.aw(parcel, aj15);
                return new GoogleCertificatesLookupQuery(str20, z8, z9, iBinder, z10, z11);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ewe[i];
            case 1:
                return new esy[i];
            case 2:
                return new fan[i];
            case 3:
                return new fap[i];
            case 4:
                return new far[i];
            case 5:
                return new LogAuditRecordsRequest[i];
            case 6:
                return new GetAccountsRequest[i];
            case 7:
                return new TokenData[i];
            case 8:
                return new GoogleSignInAccount[i];
            case 9:
                return new ClearTokenRequest[i];
            case 10:
                return new LogEventParcelable[i];
            case 11:
                return new BatchedLogErrorParcelable[i];
            case 12:
                return new DataCollectionIdentifierParcelable[i];
            case 13:
                return new LogErrorParcelable[i];
            case 14:
                return new LogVerifierResultParcelable[i];
            case 15:
                return new PlayLoggerContext[i];
            case 16:
                return new CloudMessage[i];
            case 17:
                return new CloudMessagingMessengerCompat[i];
            case 18:
                return new ConnectionResult[i];
            case 19:
                return new Feature[i];
            default:
                return new GoogleCertificatesLookupQuery[i];
        }
    }
}
