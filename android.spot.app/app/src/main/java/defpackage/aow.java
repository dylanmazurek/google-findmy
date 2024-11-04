package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aow implements axw {
    private msw a;
    private boolean b;
    private boolean c;
    public int l;
    public aow n;
    public aow o;
    public azs p;
    public azq q;
    public boolean r;
    public boolean s;
    public boolean t;
    public aow k = this;
    public int m = -1;

    @Override // defpackage.axw
    public final aow bX() {
        return this.k;
    }

    public final msw bY() {
        msw mswVar = this.a;
        if (mswVar == null) {
            msw m = msz.m(qg.i(this).d.plus(new mui((muf) qg.i(this).d.get(muf.c))));
            this.a = m;
            return m;
        }
        return mswVar;
    }

    public void l() {
        if (this.t) {
            ll.g("node attached multiple times");
        }
        if (this.q == null) {
            ll.g("attach invoked on a node without a coordinator");
        }
        this.t = true;
        this.b = true;
    }

    public void m() {
        if (!this.t) {
            ll.g("Cannot detach a node that is not attached");
        }
        if (this.b) {
            ll.g("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.c) {
            ll.g("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.t = false;
        msw mswVar = this.a;
        if (mswVar != null) {
            msz.o(mswVar, new aoz());
            this.a = null;
        }
    }

    public void o() {
        if (!this.t) {
            ll.g("reset() called on an unattached node");
        }
    }

    public void p() {
        if (!this.t) {
            ll.g("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.b) {
            ll.g("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.b = false;
        bZ();
        this.c = true;
    }

    public void q() {
        if (!this.t) {
            ll.g("node detached multiple times");
        }
        if (this.q == null) {
            ll.g("detach invoked on a node without a coordinator");
        }
        if (!this.c) {
            ll.g("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.c = false;
        n();
    }

    public void r(aow aowVar) {
        this.k = aowVar;
    }

    public void s(azq azqVar) {
        this.q = azqVar;
    }

    public boolean t() {
        return true;
    }

    public void bZ() {
    }

    public void n() {
    }
}
