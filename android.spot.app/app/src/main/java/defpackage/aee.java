package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aee extends agj implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aed();

    public aee(Object obj, agk agkVar) {
        super(obj, agkVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(a());
        agk agkVar = ((agj) this).a;
        if (amr.i(agkVar, adu.a)) {
            i2 = 0;
        } else if (amr.i(agkVar, agw.a)) {
            i2 = 1;
        } else if (amr.i(agkVar, afo.a)) {
            i2 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i2);
    }
}
