package defpackage;

import android.os.Parcel;
import com.google.android.gms.nearby.uwb.internal.RangingCapabilitiesParams;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fua extends dug implements fub {
    final /* synthetic */ bym a;

    public fua() {
        super("com.google.android.gms.nearby.uwb.internal.IRangingCapabilitiesResultListener");
    }

    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            RangingCapabilitiesParams rangingCapabilitiesParams = (RangingCapabilitiesParams) duh.a(parcel, RangingCapabilitiesParams.CREATOR);
            duh.b(parcel);
            this.a.s(new ftl(rangingCapabilitiesParams.a, rangingCapabilitiesParams.b, rangingCapabilitiesParams.c, rangingCapabilitiesParams.l, rangingCapabilitiesParams.e, jis.o(iqh.p(rangingCapabilitiesParams.f)), jis.o(iqh.p(rangingCapabilitiesParams.i)), jis.o(iqh.p(rangingCapabilitiesParams.g)), jis.o(iqh.p(rangingCapabilitiesParams.j)), jis.o(iqh.p(rangingCapabilitiesParams.k)), rangingCapabilitiesParams.m));
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fua(bym bymVar) {
        super("com.google.android.gms.nearby.uwb.internal.IRangingCapabilitiesResultListener");
        this.a = bymVar;
    }
}
