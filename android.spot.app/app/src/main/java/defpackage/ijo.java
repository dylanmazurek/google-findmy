package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ijo implements jyj {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public ijo(igg iggVar, String str, bmf bmfVar, int i) {
        this.d = i;
        this.c = str;
        this.a = bmfVar;
        this.b = iggVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, jyz] */
    @Override // defpackage.jyj
    public final void a(Throwable th) {
        if (this.d != 0) {
            ((jni) ((jni) ((jni) igh.a.g()).i(th)).j("com/google/android/libraries/spot/ble/SharedGattConnectionManagerInternal$TaskQueueManager$1", "onFailure", 788, "SharedGattConnectionManagerInternal.java")).u("Error while executing GATT client task for device %s", this.c);
            ((bmf) this.a).d(th);
            Object obj = this.b;
            synchronized (((igg) obj).e.c) {
                ((igg) obj).a(true);
                ((igg) obj).b();
            }
            return;
        }
        if (!this.a.isCancelled()) {
            ((jni) ((jni) ((jni) ijp.a.f().h(flv.a, 284)).i(th)).j("com/google/android/libraries/spot/util/LoggingUtil$2", "onFailure", 91, "LoggingUtil.java")).B((String) this.b, (Object[]) this.c);
        }
    }

    @Override // defpackage.jyj
    public final void b(Object obj) {
        if (this.d != 0) {
            ((jni) ((jni) igh.a.e()).j("com/google/android/libraries/spot/ble/SharedGattConnectionManagerInternal$TaskQueueManager$1", "onSuccess", 778, "SharedGattConnectionManagerInternal.java")).u("Successfully completed GATT client task for device %s", this.c);
            ((bmf) this.a).c(obj);
            synchronized (((igg) this.b).e.c) {
                ((igg) this.b).b();
            }
        }
    }

    public ijo(jyz jyzVar, String str, Object[] objArr, int i) {
        this.d = i;
        this.a = jyzVar;
        this.b = str;
        this.c = objArr;
    }
}
