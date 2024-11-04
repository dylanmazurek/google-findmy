package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exi implements dfu {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ exi(bmf bmfVar, int i) {
        this.b = i;
        this.a = bmfVar;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [mmx, java.lang.Object] */
    @Override // defpackage.dfu
    public final void a(dfy dfyVar) {
        if (this.b != 0) {
            ((bmf) this.a).d(dfyVar);
        } else {
            ((jni) ((jni) exl.a.f()).i(dfyVar).j("com/google/android/apps/adm/tos/TosHandlerImpl$getServerAcceptedTosVersion$2$2", "onErrorResponse", 147, "TosHandlerImpl.kt")).r("Server ToS request failed");
            this.a.p(null);
        }
    }

    public exi(msd msdVar, int i) {
        this.b = i;
        this.a = msdVar;
    }
}
