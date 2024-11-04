package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ne implements gt {
    gh a;
    public gj b;
    final /* synthetic */ Toolbar c;

    public ne(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.gt
    public final int a() {
        return 0;
    }

    @Override // defpackage.gt
    public final Parcelable bL() {
        return null;
    }

    @Override // defpackage.gt
    public final void c(Context context, gh ghVar) {
        gj gjVar;
        gh ghVar2 = this.a;
        if (ghVar2 != null && (gjVar = this.b) != null) {
            ghVar2.t(gjVar);
        }
        this.a = ghVar;
    }

    @Override // defpackage.gt
    public final void e(gs gsVar) {
        throw null;
    }

    @Override // defpackage.gt
    public final void f(boolean z) {
        if (this.b != null) {
            gh ghVar = this.a;
            if (ghVar != null) {
                int size = ghVar.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            i(this.b);
        }
    }

    @Override // defpackage.gt
    public final boolean g() {
        return false;
    }

    @Override // defpackage.gt
    public final boolean h(ha haVar) {
        return false;
    }

    @Override // defpackage.gt
    public final boolean i(gj gjVar) {
        View view = this.c.h;
        if (view instanceof gl) {
            ((gl) view).a.onActionViewCollapsed();
        }
        Toolbar toolbar = this.c;
        toolbar.removeView(toolbar.h);
        Toolbar toolbar2 = this.c;
        toolbar2.removeView(toolbar2.g);
        Toolbar toolbar3 = this.c;
        toolbar3.h = null;
        int size = toolbar3.u.size();
        while (true) {
            size--;
            if (size >= 0) {
                toolbar3.addView((View) toolbar3.u.get(size));
            } else {
                toolbar3.u.clear();
                this.b = null;
                this.c.requestLayout();
                gjVar.h(false);
                this.c.u();
                return true;
            }
        }
    }

    @Override // defpackage.gt
    public final boolean j(gj gjVar) {
        Toolbar toolbar = this.c;
        if (toolbar.g == null) {
            toolbar.g = new id(toolbar.getContext(), null, R.attr.toolbarNavigationButtonStyle);
            toolbar.g.setImageDrawable(toolbar.e);
            toolbar.g.setContentDescription(toolbar.f);
            nf nfVar = new nf();
            nfVar.a = (toolbar.m & 112) | 8388611;
            nfVar.b = 2;
            toolbar.g.setLayoutParams(nfVar);
            toolbar.g.setOnClickListener(new he(toolbar, 2));
        }
        ViewParent parent = this.c.g.getParent();
        Toolbar toolbar2 = this.c;
        if (parent != toolbar2) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar2.g);
            }
            Toolbar toolbar3 = this.c;
            toolbar3.addView(toolbar3.g);
        }
        this.c.h = gjVar.getActionView();
        this.b = gjVar;
        ViewParent parent2 = this.c.h.getParent();
        Toolbar toolbar4 = this.c;
        if (parent2 != toolbar4) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar4.h);
            }
            nf nfVar2 = new nf();
            Toolbar toolbar5 = this.c;
            nfVar2.a = 8388611 | (toolbar5.m & 112);
            nfVar2.b = 2;
            toolbar5.h.setLayoutParams(nfVar2);
            Toolbar toolbar6 = this.c;
            toolbar6.addView(toolbar6.h);
        }
        Toolbar toolbar7 = this.c;
        int childCount = toolbar7.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar7.getChildAt(childCount);
            if (((nf) childAt.getLayoutParams()).b != 2 && childAt != toolbar7.a) {
                toolbar7.removeViewAt(childCount);
                toolbar7.u.add(childAt);
            }
        }
        this.c.requestLayout();
        gjVar.h(true);
        View view = this.c.h;
        if (view instanceof gl) {
            ((gl) view).a.onActionViewExpanded();
        }
        this.c.u();
        return true;
    }

    @Override // defpackage.gt
    public final void n(Parcelable parcelable) {
    }

    @Override // defpackage.gt
    public final void d(gh ghVar, boolean z) {
    }
}
