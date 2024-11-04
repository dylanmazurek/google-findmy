package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class far implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ewd(4);
    public int a;
    public int b;

    public far() {
    }

    public final void a() {
        this.a = -1;
    }

    public final boolean b(int i) {
        int i2 = this.a;
        if (i2 >= 0 && i2 < i) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "SavedState{mAnchorPosition=" + this.a + ", mAnchorOffset=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }

    public far(far farVar) {
        this.a = farVar.a;
        this.b = farVar.b;
    }

    public far(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
    }
}
