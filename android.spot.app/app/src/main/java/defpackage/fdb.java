package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.analytics.internal.Command;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    @Deprecated
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Command(parcel);
    }

    @Override // android.os.Parcelable.Creator
    @Deprecated
    public final /* synthetic */ Object[] newArray(int i) {
        return new Command[i];
    }
}
