package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftw extends dug implements ftx {
    final /* synthetic */ bym a;

    public ftw() {
        super("com.google.android.gms.nearby.uwb.internal.IBooleanResultListener");
    }

    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            boolean e = duh.e(parcel);
            duh.b(parcel);
            this.a.s(Boolean.valueOf(e));
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftw(bym bymVar) {
        super("com.google.android.gms.nearby.uwb.internal.IBooleanResultListener");
        this.a = bymVar;
    }
}
