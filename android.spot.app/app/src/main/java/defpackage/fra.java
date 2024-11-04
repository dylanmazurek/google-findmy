package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.LocationRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fra implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int aj = fma.aj(parcel);
        WorkSource workSource = new WorkSource();
        ClientIdentity clientIdentity = null;
        long j = -1;
        long j2 = Long.MAX_VALUE;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        long j5 = 600000;
        long j6 = 3600000;
        int i = 102;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < aj) {
            int readInt = parcel.readInt();
            switch (fma.af(readInt)) {
                case 1:
                    i = fma.ah(parcel, readInt);
                    break;
                case 2:
                    j6 = fma.ak(parcel, readInt);
                    break;
                case 3:
                    j5 = fma.ak(parcel, readInt);
                    break;
                case 4:
                case 14:
                default:
                    fma.ax(parcel, readInt);
                    break;
                case 5:
                    j2 = fma.ak(parcel, readInt);
                    break;
                case 6:
                    i2 = fma.ah(parcel, readInt);
                    break;
                case 7:
                    f = fma.ae(parcel, readInt);
                    break;
                case 8:
                    j4 = fma.ak(parcel, readInt);
                    break;
                case 9:
                    z = fma.ay(parcel, readInt);
                    break;
                case 10:
                    j3 = fma.ak(parcel, readInt);
                    break;
                case 11:
                    j = fma.ak(parcel, readInt);
                    break;
                case 12:
                    i3 = fma.ah(parcel, readInt);
                    break;
                case 13:
                    i4 = fma.ah(parcel, readInt);
                    break;
                case 15:
                    z2 = fma.ay(parcel, readInt);
                    break;
                case 16:
                    workSource = (WorkSource) fma.an(parcel, readInt, WorkSource.CREATOR);
                    break;
                case 17:
                    clientIdentity = (ClientIdentity) fma.an(parcel, readInt, ClientIdentity.CREATOR);
                    break;
            }
        }
        fma.aw(parcel, aj);
        return new LocationRequest(i, j6, j5, j4, j2, j3, i2, f, z, j, i3, i4, z2, workSource, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
