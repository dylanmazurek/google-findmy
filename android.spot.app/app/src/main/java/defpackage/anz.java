package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anz {
    public final moh a;
    public boolean c;
    public amv g;
    public anv h;
    public final AtomicReference b = new AtomicReference(null);
    private final mol j = new anw(this);
    public final moh d = new anx(this);
    public final aiu e = new aiu(new anv[16]);
    public final Object f = new Object();
    public long i = -1;

    public anz(moh mohVar) {
        this.a = mohVar;
    }

    public static final void c() {
        abr.g("Unexpected notification");
        throw new mks();
    }

    public final void a() {
        this.g = amy.f(this.j);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean b() {
        /*
            Method dump skipped, instructions count: 1867
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anz.b():boolean");
    }
}
