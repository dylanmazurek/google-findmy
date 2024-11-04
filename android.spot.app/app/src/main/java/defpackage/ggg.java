package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggg {
    public String a;
    public String b;
    public String c;
    public lgz d;
    public lia e;
    public String f;
    public ldv g;
    public lix h;
    public byte i;
    public int j;

    public final void a(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null actionId");
    }

    public final void b() {
        this.i = (byte) 1;
    }

    public final void c(ldv ldvVar) {
        if (ldvVar != null) {
            this.g = ldvVar;
            return;
        }
        throw new NullPointerException("Null preferenceKey");
    }

    public final void d(String str) {
        if (str != null) {
            this.f = str;
            return;
        }
        throw new NullPointerException("Null replyHintText");
    }

    public final void e(lix lixVar) {
        if (lixVar != null) {
            this.h = lixVar;
            return;
        }
        throw new NullPointerException("Null snoozeDuration");
    }

    public final void f(lgz lgzVar) {
        if (lgzVar != null) {
            this.d = lgzVar;
            return;
        }
        throw new NullPointerException("Null threadStateUpdate");
    }

    public final void g(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null url");
    }
}
