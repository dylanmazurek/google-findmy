package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int aj = fma.aj(parcel);
        CameraPosition cameraPosition = null;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        Integer num = null;
        String str = null;
        byte b = -1;
        byte b2 = -1;
        int i = 0;
        byte b3 = -1;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        int i2 = 0;
        while (parcel.dataPosition() < aj) {
            int readInt = parcel.readInt();
            switch (fma.af(readInt)) {
                case 2:
                    b = fma.ac(parcel, readInt);
                    break;
                case 3:
                    b2 = fma.ac(parcel, readInt);
                    break;
                case 4:
                    i = fma.ah(parcel, readInt);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) fma.an(parcel, readInt, CameraPosition.CREATOR);
                    break;
                case 6:
                    b3 = fma.ac(parcel, readInt);
                    break;
                case 7:
                    b4 = fma.ac(parcel, readInt);
                    break;
                case 8:
                    b5 = fma.ac(parcel, readInt);
                    break;
                case 9:
                    b6 = fma.ac(parcel, readInt);
                    break;
                case 10:
                    b7 = fma.ac(parcel, readInt);
                    break;
                case 11:
                    b8 = fma.ac(parcel, readInt);
                    break;
                case 12:
                    b9 = fma.ac(parcel, readInt);
                    break;
                case 13:
                case 22:
                default:
                    fma.ax(parcel, readInt);
                    break;
                case 14:
                    b10 = fma.ac(parcel, readInt);
                    break;
                case 15:
                    b11 = fma.ac(parcel, readInt);
                    break;
                case 16:
                    f = fma.ap(parcel, readInt);
                    break;
                case 17:
                    f2 = fma.ap(parcel, readInt);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) fma.an(parcel, readInt, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b12 = fma.ac(parcel, readInt);
                    break;
                case 20:
                    num = fma.aq(parcel, readInt);
                    break;
                case 21:
                    str = fma.as(parcel, readInt);
                    break;
                case 23:
                    i2 = fma.ah(parcel, readInt);
                    break;
            }
        }
        fma.aw(parcel, aj);
        return new GoogleMapOptions(b, b2, i, cameraPosition, b3, b4, b5, b6, b7, b8, b9, b10, b11, f, f2, latLngBounds, b12, num, str, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
