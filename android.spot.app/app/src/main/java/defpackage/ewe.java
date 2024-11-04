package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewe extends ewb {
    public static final eyt c = new eyt();
    public static final Parcelable.Creator CREATOR = new ewd(0);

    public ewe(String str, lqd lqdVar) {
        super(str, lqdVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fma.bE(parcel, this.a);
        fma.bD(parcel, this.b);
    }
}
