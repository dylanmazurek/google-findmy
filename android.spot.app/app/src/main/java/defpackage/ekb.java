package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekb implements jyj {
    final /* synthetic */ Runnable a;
    final /* synthetic */ int b;
    final /* synthetic */ ekc c;

    public ekb(ekc ekcVar, Runnable runnable, int i) {
        this.a = runnable;
        this.b = i;
        this.c = ekcVar;
    }

    @Override // defpackage.jyj
    public final void a(Throwable th) {
        ((jni) ((jni) ((jni) ekc.b.f()).i(th)).j("com/google/android/apps/adm/integrations/spot/SpotDeviceControllerImpl$4", "onFailure", (char) 254, "SpotDeviceControllerImpl.java")).r("Failed updating device description");
        this.c.d(jdl.a, this.a, this.b);
    }

    @Override // defpackage.jyj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.c.d((jer) obj, this.a, this.b);
    }
}
