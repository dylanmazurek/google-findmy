package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cnz;
import defpackage.coa;
import defpackage.inw;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new inw(1);
    private final coa a;

    public ParcelImpl(Parcel parcel) {
        this.a = new cnz(parcel).c();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new cnz(parcel).k(this.a);
    }
}
