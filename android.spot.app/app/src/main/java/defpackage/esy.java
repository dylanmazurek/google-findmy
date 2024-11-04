package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esy extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new ewd(1);
    public boolean a;

    public esy(Parcel parcel) {
        super(parcel);
        boolean readBoolean;
        readBoolean = parcel.readBoolean();
        this.a = readBoolean;
    }

    public final String toString() {
        return "DeviceOwnersCard{superState=" + String.valueOf(getSuperState()) + ", areSharedOwnersExpanded=" + this.a + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBoolean(this.a);
    }

    public esy(Parcelable parcelable) {
        super(parcelable);
    }
}
