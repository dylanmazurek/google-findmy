package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fth extends dug implements fti {
    final /* synthetic */ bym a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fth(bym bymVar) {
        super("com.google.android.gms.nearby.fastpair.internal.IFastPairStatusCallback");
        this.a = bymVar;
    }

    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Status status = (Status) duh.a(parcel, Status.CREATOR);
            duh.b(parcel);
            fma.ba(status, null, this.a);
            return true;
        }
        return false;
    }

    public fth() {
        super("com.google.android.gms.nearby.fastpair.internal.IFastPairStatusCallback");
    }
}
