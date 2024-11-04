package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class icc implements AutoCloseable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ icc(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ibh] */
    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    jer jerVar = (jer) this.b;
                    boolean g = jerVar.g();
                    Object obj = this.a;
                    if (g) {
                        ((igd) obj).b.a.remove(jerVar.c());
                    }
                    synchronized (((igd) obj).h.c) {
                        ((igd) obj).e--;
                        ((jni) ((jni) igh.a.e()).j("com/google/android/libraries/spot/ble/SharedGattConnectionManagerInternal$GattClientValueAndCloser", "closeImmutableClientAsync", 624, "SharedGattConnectionManagerInternal.java")).z("Closing connection for device %s\nNumber of active immutable connections: %d\nMutable client is active: %b", ((igd) obj).c, Integer.valueOf(((igd) obj).e), Boolean.valueOf(((igd) obj).f));
                        if (((igd) obj).e <= 0 && !((igd) obj).f) {
                            ((igd) obj).c();
                            return;
                        }
                        return;
                    }
                }
                this.b.cancel(false);
                this.a.close();
                return;
            }
            ((ici) this.a).e.remove(this.b);
            return;
        }
        ((ici) this.a).e.remove(this.b);
    }

    public /* synthetic */ icc(jyz jyzVar, ibh ibhVar, int i) {
        this.c = i;
        this.b = jyzVar;
        this.a = ibhVar;
    }
}
