package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hck implements View.OnAttachStateChangeListener {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public hck(RecyclerView recyclerView, lj ljVar, int i) {
        this.c = i;
        this.b = recyclerView;
        this.a = ljVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [gze, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [gze, java.lang.Object] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ((hid) this.b).b.d(((hia) this.a).x);
                        if (((hid) this.b).b.a) {
                            ((hia) this.a).f(false);
                            Object obj = this.a;
                            ((hia) obj).x.a(((hid) this.b).b.a());
                            return;
                        }
                        return;
                    }
                    ((RecyclerView) this.b).U((lj) this.a);
                    return;
                }
                ((hfg) this.b).a.e(this.a);
                this.a.a();
                return;
            }
            fil filVar = (fil) this.b;
            filVar.f();
            cb.c((ViewGroup) ((ag) filVar.c).P.getParent(), ((ao) this.a).a).f();
            return;
        }
        ((hcl) this.b).b.d((frx) this.a);
        if (((hcl) this.b).b.c()) {
            ((frx) this.a).au();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [gze, java.lang.Object] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ((hid) this.b).b.e(((hia) this.a).x);
                        return;
                    } else {
                        ((RecyclerView) this.b).U(null);
                        return;
                    }
                }
                ((hfg) this.b).a.i(this.a);
                return;
            }
            return;
        }
        ((hcl) this.b).b.e((frx) this.a);
    }

    public hck(ao aoVar, fil filVar, int i) {
        this.c = i;
        this.a = aoVar;
        this.b = filVar;
    }

    public hck(hia hiaVar, hid hidVar, int i) {
        this.c = i;
        this.b = hidVar;
        this.a = hiaVar;
    }

    public hck(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }
}
