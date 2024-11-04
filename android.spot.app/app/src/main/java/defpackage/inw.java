package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class inw implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public inw(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return new iss(parcel);
            }
            return new ParcelImpl(parcel);
        }
        return new inx(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 != 1) {
                return new iss[i];
            }
            return new ParcelImpl[i];
        }
        return new inx[i];
    }
}
