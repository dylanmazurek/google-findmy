package defpackage;

import android.content.Intent;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gho {
    public String a;
    public goa b;
    public List c;
    public Intent d;
    public lfq e;
    public ghr f;
    private int g;
    private lgz h;
    private gxh i;
    private boolean j;
    private byte k;
    private int l;

    public final ghp a() {
        List list;
        lgz lgzVar;
        gxh gxhVar;
        ghr ghrVar;
        if (this.k == 3 && this.l != 0 && (list = this.c) != null && (lgzVar = this.h) != null && (gxhVar = this.i) != null && (ghrVar = this.f) != null) {
            return new ghp(this.g, this.a, this.b, list, lgzVar, this.d, gxhVar, this.e, this.j, ghrVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.l == 0) {
            sb.append(" source");
        }
        if ((this.k & 1) == 0) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" threads");
        }
        if (this.h == null) {
            sb.append(" threadStateUpdate");
        }
        if (this.i == null) {
            sb.append(" localThreadState");
        }
        if ((this.k & 2) == 0) {
            sb.append(" activityLaunched");
        }
        if (this.f == null) {
            sb.append(" removalInfo");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(Collection collection) {
        List list = this.c;
        if (list != null) {
            list.addAll(collection);
            return;
        }
        throw new IllegalStateException("Property \"threads\" has not been set");
    }

    public final void c(boolean z) {
        this.j = z;
        this.k = (byte) (this.k | 2);
    }

    public final void d(gxh gxhVar) {
        if (gxhVar != null) {
            this.i = gxhVar;
            return;
        }
        throw new NullPointerException("Null localThreadState");
    }

    public final void e(lgz lgzVar) {
        if (lgzVar != null) {
            this.h = lgzVar;
            return;
        }
        throw new NullPointerException("Null threadStateUpdate");
    }

    public final void f(int i) {
        this.g = i;
        this.k = (byte) (this.k | 1);
    }

    public final void g() {
        this.l = 1;
    }
}
