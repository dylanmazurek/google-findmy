package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbm implements jyj {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public jbm(String str, jyz jyzVar, int i) {
        this.c = i;
        this.b = str;
        this.a = jyzVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, jbe] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, jyj] */
    @Override // defpackage.jyj
    public final void a(Throwable th) {
        if (this.c != 0) {
            if (this.a.isCancelled()) {
                ((jni) ((jni) ijp.a.e().h(flv.a, 284)).j("com/google/android/libraries/spot/util/LoggingUtil$1", "onFailure", 62, "LoggingUtil.java")).u("%s was canceled", this.b);
                return;
            } else {
                ((jni) ((jni) ((jni) ijp.a.f().h(flv.a, 284)).i(th)).j("com/google/android/libraries/spot/util/LoggingUtil$1", "onFailure", 64, "LoggingUtil.java")).u("%s error", this.b);
                return;
            }
        }
        th.getClass();
        jbe e = jbu.e(jbu.f(), this.a);
        try {
            this.b.a(th);
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, jbe] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, jyj] */
    @Override // defpackage.jyj
    public final void b(Object obj) {
        String str;
        if (this.c != 0) {
            ((jni) ((jni) ijp.a.b().h(flv.a, 284)).j("com/google/android/libraries/spot/util/LoggingUtil$1", "onSuccess", 54, "LoggingUtil.java")).u("%s success", this.b);
            jni jniVar = (jni) ((jni) ijp.a.d().h(flv.a, 284)).j("com/google/android/libraries/spot/util/LoggingUtil$1", "onSuccess", 55, "LoggingUtil.java");
            if (obj != null) {
                str = obj.toString();
            } else {
                str = "null";
            }
            jniVar.y("%s success: %s", this.b, str);
            return;
        }
        jbe e = jbu.e(jbu.f(), this.a);
        try {
            this.b.b(obj);
        } finally {
        }
    }

    public jbm(jbe jbeVar, jyj jyjVar, int i) {
        this.c = i;
        this.a = jbeVar;
        this.b = jyjVar;
    }
}
