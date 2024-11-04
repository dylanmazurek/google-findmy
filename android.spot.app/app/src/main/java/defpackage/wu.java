package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wu implements wq {
    private final vb a;
    private va b;
    private va c;
    private va d;

    public wu(vb vbVar) {
        this.a = vbVar;
    }

    @Override // defpackage.wq
    public final long a(va vaVar, va vaVar2, va vaVar3) {
        mmb it = moz.ak(0, vaVar.b()).iterator();
        long j = 0;
        while (it.a) {
            int a = it.a();
            j = Math.max(j, this.a.a(a).e(vaVar.a(a), vaVar2.a(a), vaVar3.a(a)));
        }
        return j;
    }

    @Override // defpackage.wq
    public final va b(va vaVar, va vaVar2, va vaVar3) {
        if (this.d == null) {
            this.d = vaVar3.c();
        }
        va vaVar4 = this.d;
        if (vaVar4 == null) {
            mpd.b("endVelocityVector");
            vaVar4 = null;
        }
        int b = vaVar4.b();
        for (int i = 0; i < b; i++) {
            va vaVar5 = this.d;
            if (vaVar5 == null) {
                mpd.b("endVelocityVector");
                vaVar5 = null;
            }
            vaVar5.e(i, this.a.a(i).b(vaVar.a(i), vaVar2.a(i), vaVar3.a(i)));
        }
        va vaVar6 = this.d;
        if (vaVar6 == null) {
            mpd.b("endVelocityVector");
            return null;
        }
        return vaVar6;
    }

    @Override // defpackage.wq
    public final va c(long j, va vaVar, va vaVar2, va vaVar3) {
        if (this.b == null) {
            this.b = vaVar.c();
        }
        va vaVar4 = this.b;
        if (vaVar4 == null) {
            mpd.b("valueVector");
            vaVar4 = null;
        }
        int b = vaVar4.b();
        for (int i = 0; i < b; i++) {
            va vaVar5 = this.b;
            if (vaVar5 == null) {
                mpd.b("valueVector");
                vaVar5 = null;
            }
            vaVar5.e(i, this.a.a(i).c(j, vaVar.a(i), vaVar2.a(i), vaVar3.a(i)));
        }
        va vaVar6 = this.b;
        if (vaVar6 == null) {
            mpd.b("valueVector");
            return null;
        }
        return vaVar6;
    }

    @Override // defpackage.wq
    public final va d(long j, va vaVar, va vaVar2, va vaVar3) {
        if (this.c == null) {
            this.c = vaVar3.c();
        }
        va vaVar4 = this.c;
        if (vaVar4 == null) {
            mpd.b("velocityVector");
            vaVar4 = null;
        }
        int b = vaVar4.b();
        for (int i = 0; i < b; i++) {
            va vaVar5 = this.c;
            if (vaVar5 == null) {
                mpd.b("velocityVector");
                vaVar5 = null;
            }
            vaVar5.e(i, this.a.a(i).d(j, vaVar.a(i), vaVar2.a(i), vaVar3.a(i)));
        }
        va vaVar6 = this.c;
        if (vaVar6 == null) {
            mpd.b("velocityVector");
            return null;
        }
        return vaVar6;
    }

    @Override // defpackage.wq
    public final /* synthetic */ boolean e() {
        return false;
    }

    public wu(vk vkVar) {
        this(new wt(vkVar));
    }
}
