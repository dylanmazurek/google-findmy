package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.apps.adm.R;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class iga implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ iga(hmh hmhVar, LayoutInflater layoutInflater, ViewGroup viewGroup, FrameLayout frameLayout, Bundle bundle, int i) {
        this.f = i;
        this.b = hmhVar;
        this.d = layoutInflater;
        this.c = viewGroup;
        this.e = frameLayout;
        this.a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Window window;
        if (this.f != 0) {
            Object obj = this.b;
            hmh hmhVar = (hmh) obj;
            if (hmhVar.am != null) {
                z = true;
            } else {
                z = false;
            }
            hwx.V(z, "configuration can't be null after initialization.");
            Context f = hmhVar.am.e.f(((LayoutInflater) this.d).getContext());
            ag agVar = (ag) obj;
            Bundle bundle = agVar.m;
            if (bundle != null && bundle.getBoolean("accountMenuFlavorsStyle", false)) {
                f = new ContextThemeWrapper(f, R.style.OneGoogle_AccountMenuFlavors);
            }
            Bundle bundle2 = agVar.m;
            if (bundle2 != null && bundle2.getBoolean("dialogCenteredStyle", false)) {
                f = new ContextThemeWrapper(f, R.style.OneGoogle_DialogCentered);
            }
            Object obj2 = this.e;
            View inflate = LayoutInflater.from(f).inflate(R.layout.og_dialog, (ViewGroup) this.c, false);
            ((FrameLayout) obj2).addView(inflate);
            ExpandableDialogView expandableDialogView = (ExpandableDialogView) inflate.findViewById(R.id.og_dialog_view);
            expandableDialogView.getClass();
            hmhVar.al = expandableDialogView;
            hmhVar.am.a.a((View) obj2);
            ExpandableDialogView expandableDialogView2 = hmhVar.al;
            hmc hmcVar = hmhVar.am;
            expandableDialogView2.l = hmcVar.f;
            expandableDialogView2.b(hmcVar.d);
            Dialog dialog = ((v) obj).d;
            SparseArray sparseArray = null;
            if (dialog != null) {
                window = dialog.getWindow();
            } else {
                window = null;
            }
            ExpandableDialogView expandableDialogView3 = hmhVar.al;
            expandableDialogView3.k = window;
            expandableDialogView3.j = new hep(obj, 16);
            hmj hmjVar = hmhVar.ak;
            if (hmjVar != null) {
                hmhVar.aF(hmjVar, expandableDialogView3);
                return;
            }
            Object obj3 = this.a;
            if (obj3 != null) {
                sparseArray = ((Bundle) obj3).getSparseParcelableArray("viewHierarchyState");
            }
            hmhVar.aj = sparseArray;
            return;
        }
        eew eewVar = new eew(10);
        igb igbVar = (igb) this.a;
        igbVar.c.a((kyf) this.b, eewVar);
        igbVar.c.b((igd) this.d);
        ((jck) this.e).d();
    }

    public /* synthetic */ iga(igb igbVar, kyf kyfVar, ihy ihyVar, igd igdVar, jck jckVar, int i) {
        this.f = i;
        this.a = igbVar;
        this.b = kyfVar;
        this.c = ihyVar;
        this.d = igdVar;
        this.e = jckVar;
    }
}
