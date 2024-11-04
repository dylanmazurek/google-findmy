package defpackage;

import android.os.Looper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cih {
    public volatile ckd a;
    public msw b;
    public Executor c;
    public Executor d;
    public cht e;
    public boolean f;
    public lbr h;
    public final elo i = new elo((byte[]) null, (char[]) null);
    private final ThreadLocal j = new ThreadLocal();
    public final Map g = new LinkedHashMap();

    public abstract cht a();

    public final cht b() {
        cht chtVar = this.e;
        if (chtVar == null) {
            mpd.b("internalTracker");
            return null;
        }
        return chtVar;
    }

    public cij c() {
        throw new mkv((byte[]) null);
    }

    @mkp
    public ckg d(chj chjVar) {
        throw new mkv((byte[]) null);
    }

    public final ckg e() {
        lbr lbrVar = this.h;
        if (lbrVar == null) {
            mpd.b("connectionManager");
            lbrVar = null;
        }
        ckg e = lbrVar.e();
        if (e != null) {
            return e;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final Object f(Callable callable) {
        m();
        try {
            Object call = callable.call();
            p();
            return call;
        } finally {
            n();
        }
    }

    public final Object g(Class cls, ckg ckgVar) {
        if (cls.isInstance(ckgVar)) {
            return ckgVar;
        }
        return null;
    }

    public Map h() {
        return mly.a;
    }

    @mkp
    public Set i() {
        return mlz.a;
    }

    public final msw j() {
        msw mswVar = this.b;
        if (mswVar == null) {
            mpd.b("coroutineScope");
            return null;
        }
        return mswVar;
    }

    public final void k() {
        if (this.f || Looper.getMainLooper().getThread() != Thread.currentThread()) {
        } else {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void l() {
        if (!r() && this.j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @mkp
    public final void m() {
        k();
        k();
        ckd a = e().a();
        if (!a.i()) {
            mpp.n(mnc.a, new bea(b(), (mmx) null, 8));
        }
        if (((ckl) a).d.isWriteAheadLoggingEnabled()) {
            a.e();
        } else {
            a.d();
        }
    }

    public final void n() {
        e().a().f();
        if (!r()) {
            cht b = b();
            ciz cizVar = b.c;
            mnw mnwVar = b.d;
            cizVar.h(b.e);
        }
    }

    public final void o(Runnable runnable) {
        m();
        try {
            runnable.run();
            p();
        } finally {
            n();
        }
    }

    @mkp
    public final void p() {
        e().a().h();
    }

    public final boolean q() {
        lbr lbrVar = this.h;
        if (lbrVar == null) {
            mpd.b("connectionManager");
            lbrVar = null;
        }
        if (lbrVar.e() != null) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        return e().a().i();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ckd] */
    public final boolean s() {
        lbr lbrVar = this.h;
        if (lbrVar == null) {
            mpd.b("connectionManager");
            lbrVar = null;
        }
        ?? r0 = lbrVar.d;
        if (r0 != 0) {
            return r0.j();
        }
        return false;
    }

    @mkp
    public List t() {
        return mlx.a;
    }

    public final Object u(mol molVar, mmx mmxVar) {
        lbr lbrVar = this.h;
        if (lbrVar == null) {
            mpd.b("connectionManager");
            lbrVar = null;
        }
        return molVar.a((cie) ((chz) lbrVar.a).a.a(), mmxVar);
    }

    public final void v(ddh ddhVar) {
        cht b = b();
        ciz cizVar = b.c;
        bzb.b(ddhVar, "PRAGMA temp_store = MEMORY");
        bzb.b(ddhVar, "PRAGMA recursive_triggers = 1");
        bzb.b(ddhVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
        synchronized (b.g) {
            bwc bwcVar = b.h;
            chr chrVar = b.f;
        }
    }
}
