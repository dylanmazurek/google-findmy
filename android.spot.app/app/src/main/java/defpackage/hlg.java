package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlg implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public hlg(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        Uri uri = null;
        Bundle bundle = null;
        String str = null;
        switch (this.a) {
            case 0:
                int readInt = parcel.readInt();
                Parcelable readParcelable = parcel.readParcelable(hlp.class.getClassLoader());
                if (readInt == 1) {
                    z = true;
                }
                return new hlh(z, readParcelable);
            case 1:
                return new gak(parcel);
            case 2:
                return new hzx(parcel);
            case 3:
                return new ipm(parcel);
            case 4:
                int aj = fma.aj(parcel);
                long j = 0;
                String str2 = null;
                String str3 = null;
                Bundle bundle2 = null;
                Uri uri2 = null;
                int i = 0;
                while (parcel.dataPosition() < aj) {
                    int readInt2 = parcel.readInt();
                    switch (fma.af(readInt2)) {
                        case 1:
                            str2 = fma.as(parcel, readInt2);
                            break;
                        case 2:
                            str3 = fma.as(parcel, readInt2);
                            break;
                        case 3:
                            i = fma.ah(parcel, readInt2);
                            break;
                        case 4:
                            j = fma.ak(parcel, readInt2);
                            break;
                        case 5:
                            bundle2 = fma.al(parcel, readInt2);
                            break;
                        case 6:
                            uri2 = (Uri) fma.an(parcel, readInt2, Uri.CREATOR);
                            break;
                        default:
                            fma.ax(parcel, readInt2);
                            break;
                    }
                }
                fma.aw(parcel, aj);
                return new kpc(str2, str3, i, j, bundle2, uri2);
            case 5:
                int aj2 = fma.aj(parcel);
                Uri uri3 = null;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < aj2) {
                    int readInt3 = parcel.readInt();
                    int af = fma.af(readInt3);
                    if (af != 1) {
                        if (af != 2) {
                            if (af != 3) {
                                fma.ax(parcel, readInt3);
                            } else {
                                arrayList = fma.av(parcel, readInt3, kpm.CREATOR);
                            }
                        } else {
                            uri3 = (Uri) fma.an(parcel, readInt3, Uri.CREATOR);
                        }
                    } else {
                        uri = (Uri) fma.an(parcel, readInt3, Uri.CREATOR);
                    }
                }
                fma.aw(parcel, aj2);
                return new kpn(uri, uri3, arrayList);
            case 6:
                int aj3 = fma.aj(parcel);
                while (parcel.dataPosition() < aj3) {
                    int readInt4 = parcel.readInt();
                    if (fma.af(readInt4) != 2) {
                        fma.ax(parcel, readInt4);
                    } else {
                        str = fma.as(parcel, readInt4);
                    }
                }
                fma.aw(parcel, aj3);
                return new kpm(str);
            case 7:
                int aj4 = fma.aj(parcel);
                while (parcel.dataPosition() < aj4) {
                    int readInt5 = parcel.readInt();
                    if (fma.af(readInt5) != 2) {
                        fma.ax(parcel, readInt5);
                    } else {
                        bundle = fma.al(parcel, readInt5);
                    }
                }
                fma.aw(parcel, aj4);
                return new ksl(bundle);
            case 8:
                return new kus(parcel);
            default:
                byte[] bArr = new byte[parcel.readInt()];
                parcel.readByteArray(bArr);
                return new ProtoParsers$InternalDontUse(bArr, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new hlh[i];
            case 1:
                return new gak[i];
            case 2:
                return new hzx[i];
            case 3:
                return new ipm[i];
            case 4:
                return new kpc[i];
            case 5:
                return new kpn[i];
            case 6:
                return new kpm[i];
            case 7:
                return new ksl[i];
            case 8:
                return new kus[i];
            default:
                return new ProtoParsers$InternalDontUse[i];
        }
    }
}
