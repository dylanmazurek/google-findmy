package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class bi extends cob {
    public final be a;
    public bn b = null;
    public ag c = null;
    private boolean e;

    @Deprecated
    public bi(be beVar) {
        this.a = beVar;
    }

    public static String a(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // defpackage.cob
    public final void b(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
        } else {
            throw new IllegalStateException(a.af(this, "ViewPager with adapter ", " requires a view id"));
        }
    }

    @Override // defpackage.cob
    public final void c(Object obj) {
        if (this.b == null) {
            this.b = new f(this.a);
        }
        bn bnVar = this.b;
        ag agVar = (ag) obj;
        be beVar = agVar.A;
        if (beVar != null && beVar != ((f) bnVar).a) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + agVar.toString() + " is already attached to a FragmentManager.");
        }
        bnVar.n(new bm(6, agVar));
        if (agVar.equals(this.c)) {
            this.c = null;
        }
    }

    @Override // defpackage.cob
    public final void d() {
        bn bnVar = this.b;
        if (bnVar != null) {
            if (!this.e) {
                try {
                    this.e = true;
                    bnVar.c();
                } finally {
                    this.e = false;
                }
            }
            this.b = null;
        }
    }
}
