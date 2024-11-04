package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mic extends mat {
    static final boolean a = mfh.g("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST");
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.mai
    public final mas a(mak makVar) {
        if (a) {
            return new mhw(makVar);
        }
        return new mib(makVar);
    }

    @Override // defpackage.mat
    public final mbi b(Map map) {
        Object mhyVar;
        try {
            Boolean a2 = mfx.a(map, "shuffleAddressList");
            if (a) {
                mhyVar = new mhs(a2);
            } else {
                mhyVar = new mhy(a2);
            }
            return new mbi(mhyVar);
        } catch (RuntimeException e) {
            return new mbi(mca.i.c(e).d("Failed parsing configuration for pick_first"));
        }
    }

    @Override // defpackage.mat
    public final String c() {
        return "pick_first";
    }

    @Override // defpackage.mat
    public final void d() {
    }

    @Override // defpackage.mat
    public final void e() {
    }
}
