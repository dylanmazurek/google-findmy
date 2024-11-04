package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class exf implements dfv {
    private final /* synthetic */ int a;

    public /* synthetic */ exf(int i) {
        this.a = i;
    }

    @Override // defpackage.dfv
    public final void b(Object obj) {
        if (this.a != 0) {
            jnk jnkVar = dvt.a;
            return;
        }
        loo looVar = (loo) obj;
        looVar.getClass();
        jni jniVar = (jni) exl.a.e().j("com/google/android/apps/adm/tos/TosHandlerImpl", "setServerAcceptedTosVersionAsync$lambda$0", 128, "TosHandlerImpl.kt");
        Integer valueOf = Integer.valueOf(looVar.a);
        lon b = lon.b(looVar.b);
        if (b == null) {
            b = lon.TOS_VERSION_UPDATED;
        }
        jniVar.z("Server ToS version update succeeded. AcceptedTosVersion: %d, Response code: %s, ServerTosVersion: %d.", valueOf, b, Integer.valueOf(looVar.c));
    }
}
