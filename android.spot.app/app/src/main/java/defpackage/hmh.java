package defpackage;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Property;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.google.android.apps.adm.R;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmh extends dq implements hgx {
    public static final Property af = new hlw(Float.class);
    public static final Property ag = new hlx(Integer.class);
    public hls ah;
    public boolean ai;
    public SparseArray aj;
    public hmj ak;
    public ExpandableDialogView al;
    public hmc am;
    public hjq an;
    private boolean ap;
    private hmg aq;
    public final hri ao = new hri(this);
    private final op ar = new hlu(this);

    private static void aJ(ViewGroup viewGroup, hmd hmdVar) {
        viewGroup.removeAllViews();
        viewGroup.addView(hmdVar.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
    }

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        this.ao.p(new iga(this, layoutInflater, viewGroup, frameLayout, bundle, 1));
        return frameLayout;
    }

    @Override // defpackage.dq, defpackage.v
    public final Dialog a(Bundle bundle) {
        Dialog a = super.a(bundle);
        ((od) a).b.b(this, this.ar);
        return a;
    }

    public final void aF(hmj hmjVar, View view) {
        ijs.c();
        this.ap = true;
        aJ((ViewGroup) view.findViewById(R.id.og_container_footer), hmjVar.c);
        aJ((ViewGroup) view.findViewById(R.id.og_header_container), hmjVar.a);
        aJ((ViewGroup) view.findViewById(R.id.og_container_content_view), hmjVar.b);
        bwn.r(view.findViewById(R.id.og_header_close_button), view.getResources().getString(hmjVar.d));
        view.setVisibility(0);
        hmg hmgVar = this.aq;
        if (hmgVar != null) {
            hmgVar.a(view);
        }
    }

    public final void aG() {
        if (au()) {
            if (ax()) {
                super.e();
            } else {
                super.d();
            }
            hmc hmcVar = this.am;
            if (hmcVar != null) {
                hmcVar.b.a();
            }
        }
    }

    public final void aH() {
        ExpandableDialogView expandableDialogView;
        View view;
        hmc hmcVar = this.am;
        if (hmcVar != null && (expandableDialogView = this.al) != null && (view = expandableDialogView.h) != null) {
            hmcVar.d.f(new bym(5), view);
        }
        d();
    }

    public final void aI(hmg hmgVar) {
        ExpandableDialogView expandableDialogView;
        this.aq = hmgVar;
        if (this.ap && hmgVar != null && (expandableDialogView = this.al) != null) {
            hmgVar.a(expandableDialogView);
        }
    }

    @Override // defpackage.ag
    public final void ab() {
        super.ab();
        this.an = null;
        this.ak = null;
        this.am = null;
        this.aq = null;
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        view.setSystemUiVisibility(view.getSystemUiVisibility() | 1280);
        view.setSystemUiVisibility(view.getSystemUiVisibility() | 512);
        this.ao.p(new hlt(this, view, bundle, 0));
    }

    @Override // defpackage.hgx
    public final boolean b() {
        if (this.am != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.v
    public final void d() {
        Dialog dialog = this.d;
        if (dialog != null && dialog.getWindow() != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.d.getWindow().getDecorView(), (Property<View, Float>) af, 1.0f, 0.0f);
            ofFloat.setDuration(83L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addListener(new hlv(this));
            ofFloat.start();
            return;
        }
        aG();
    }

    @Override // defpackage.v, defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        o(2, R.style.OneGoogle_Dialog);
    }

    @Override // defpackage.v, defpackage.ag
    public final void h() {
        super.h();
        hls hlsVar = this.ah;
        if (hlsVar != null) {
            hlsVar.d.getViewTreeObserver().removeOnScrollChangedListener(hlsVar.b);
            hlsVar.d.getViewTreeObserver().removeOnGlobalLayoutListener(hlsVar.c);
            this.ah = null;
        }
        hmc hmcVar = this.am;
        if (hmcVar != null) {
            hmcVar.c.a();
        }
        this.al = null;
        this.ap = false;
    }

    @Override // defpackage.v, defpackage.ag
    public final void j(Bundle bundle) {
        super.j(bundle);
        if (this.al != null) {
            SparseArray sparseArray = new SparseArray();
            this.aj = sparseArray;
            this.al.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("viewHierarchyState", this.aj);
        }
    }

    @Override // defpackage.v, defpackage.ag
    public final void k() {
        super.k();
        this.ai = true;
        hjq hjqVar = this.an;
        if (hjqVar != null) {
            hjqVar.b();
        }
    }

    @Override // defpackage.v, defpackage.ag
    public final void l() {
        super.l();
        this.ai = false;
        hjq hjqVar = this.an;
        if (hjqVar != null) {
            hjqVar.c();
        }
    }

    @Override // defpackage.ag, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ExpandableDialogView expandableDialogView = this.al;
        if (expandableDialogView != null) {
            expandableDialogView.onConfigurationChanged(configuration);
        }
    }
}
