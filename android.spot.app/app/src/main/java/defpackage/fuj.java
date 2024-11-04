package defpackage;

import android.os.Parcel;
import com.google.android.gms.nearby.uwb.internal.UwbAddressParams;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fuj extends dug implements fuk {
    final /* synthetic */ fuu a;
    final /* synthetic */ bym b;

    public fuj() {
        super("com.google.android.gms.nearby.uwb.internal.IUwbAddressResultListener");
    }

    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            UwbAddressParams uwbAddressParams = (UwbAddressParams) duh.a(parcel, UwbAddressParams.CREATOR);
            duh.b(parcel);
            this.a.a = new ftq(uwbAddressParams.a);
            this.b.s(this.a.a);
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fuj(fuu fuuVar, bym bymVar) {
        super("com.google.android.gms.nearby.uwb.internal.IUwbAddressResultListener");
        this.b = bymVar;
        this.a = fuuVar;
    }
}
