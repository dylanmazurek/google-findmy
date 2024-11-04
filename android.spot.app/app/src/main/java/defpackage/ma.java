package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ma extends cad {
    public static final Parcelable.Creator CREATOR = new lz(0);
    public Parcelable a;

    public ma(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readParcelable(classLoader == null ? lr.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.cad, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
    }

    public ma(Parcelable parcelable) {
        super(parcelable);
    }
}
