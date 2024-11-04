package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int aj = fma.aj(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String str3 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = 0.0f;
        int i = 0;
        int i2 = 0;
        float f8 = 0.0f;
        while (parcel.dataPosition() < aj) {
            int readInt = parcel.readInt();
            switch (fma.af(readInt)) {
                case 2:
                    latLng = (LatLng) fma.an(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    str = fma.as(parcel, readInt);
                    break;
                case 4:
                    str2 = fma.as(parcel, readInt);
                    break;
                case 5:
                    iBinder = fma.am(parcel, readInt);
                    break;
                case 6:
                    f = fma.ae(parcel, readInt);
                    break;
                case 7:
                    f2 = fma.ae(parcel, readInt);
                    break;
                case 8:
                    z = fma.ay(parcel, readInt);
                    break;
                case 9:
                    z2 = fma.ay(parcel, readInt);
                    break;
                case 10:
                    z3 = fma.ay(parcel, readInt);
                    break;
                case 11:
                    f3 = fma.ae(parcel, readInt);
                    break;
                case 12:
                    f4 = fma.ae(parcel, readInt);
                    break;
                case 13:
                    f5 = fma.ae(parcel, readInt);
                    break;
                case 14:
                    f6 = fma.ae(parcel, readInt);
                    break;
                case 15:
                    f7 = fma.ae(parcel, readInt);
                    break;
                case 16:
                default:
                    fma.ax(parcel, readInt);
                    break;
                case 17:
                    i = fma.ah(parcel, readInt);
                    break;
                case 18:
                    iBinder2 = fma.am(parcel, readInt);
                    break;
                case 19:
                    i2 = fma.ah(parcel, readInt);
                    break;
                case 20:
                    str3 = fma.as(parcel, readInt);
                    break;
                case 21:
                    f8 = fma.ae(parcel, readInt);
                    break;
            }
        }
        fma.aw(parcel, aj);
        return new MarkerOptions(latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5, f6, f7, i, iBinder2, i2, str3, f8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
