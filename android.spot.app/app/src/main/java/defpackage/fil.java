package defpackage;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentContainerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fil {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    private boolean e;

    public fil(bfi bfiVar, bl blVar, ag agVar) {
        this.e = false;
        this.a = -1;
        this.b = bfiVar;
        this.d = blVar;
        this.c = agVar;
    }

    public final void a(fik fikVar, ConnectionResult connectionResult, String str) {
        ((ta) this.b).put(fikVar, connectionResult);
        ((ta) this.c).put(fikVar, str);
        this.a--;
        if (!connectionResult.b()) {
            this.e = true;
        }
        if (this.a == 0) {
            if (this.e) {
                ((bym) this.d).r(new fho((rx) this.b));
            } else {
                ((bym) this.d).s(this.c);
            }
        }
    }

    public final Bundle b() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        ag agVar = (ag) this.c;
        if (agVar.g == -1 && (bundle = agVar.h) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new bk((ag) this.c));
        if (((ag) this.c).g >= 0) {
            Bundle bundle3 = new Bundle();
            ((ag) this.c).j(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            ((bfi) this.b).y((ag) this.c, bundle3, false);
            Bundle bundle4 = new Bundle();
            ((ag) this.c).ae.f(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle b = ((ag) this.c).C.b();
            if (!b.isEmpty()) {
                bundle2.putBundle("childFragmentManager", b);
            }
            if (((ag) this.c).P != null) {
                h();
            }
            SparseArray<? extends Parcelable> sparseArray = ((ag) this.c).i;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = ((ag) this.c).j;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = ((ag) this.c).m;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void c() {
        View view;
        View view2;
        ag g = be.g(((ag) this.c).O);
        ag agVar = ((ag) this.c).D;
        if (g != null && !g.equals(agVar)) {
            Object obj = this.c;
            ag agVar2 = (ag) obj;
            int i = agVar2.F;
            int i2 = cdr.a;
            obj.getClass();
            cea ceaVar = new cea(agVar2, g, i);
            cdr.d(ceaVar);
            cdq b = cdr.b(agVar2);
            if (b.b.contains(cdp.DETECT_WRONG_NESTED_HIERARCHY) && cdr.e(b, obj.getClass(), ceaVar.getClass())) {
                cdr.c(b, ceaVar);
            }
        }
        Object obj2 = this.d;
        Object obj3 = this.c;
        ViewGroup viewGroup = ((ag) obj3).O;
        int i3 = -1;
        if (viewGroup != null) {
            bl blVar = (bl) obj2;
            int indexOf = blVar.a.indexOf(obj3);
            int i4 = indexOf - 1;
            while (true) {
                if (i4 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= blVar.a.size()) {
                            break;
                        }
                        ag agVar3 = (ag) blVar.a.get(indexOf);
                        if (agVar3.O == viewGroup && (view = agVar3.P) != null) {
                            i3 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    ag agVar4 = (ag) blVar.a.get(i4);
                    if (agVar4.O == viewGroup && (view2 = agVar4.P) != null) {
                        i3 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i4--;
                }
            }
        }
        ag agVar5 = (ag) this.c;
        agVar5.O.addView(agVar5.P, i3);
    }

    final void d() {
        Bundle bundle;
        String str;
        if (((ag) this.c).v) {
            return;
        }
        if (be.Z(3)) {
            Objects.toString(this.c);
        }
        Bundle bundle2 = ((ag) this.c).h;
        ViewGroup viewGroup = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        ag agVar = (ag) this.c;
        LayoutInflater I = agVar.I(bundle);
        ViewGroup viewGroup2 = agVar.O;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = agVar.F;
            if (i != 0) {
                if (i != -1) {
                    viewGroup = (ViewGroup) agVar.A.n.a(i);
                    if (viewGroup == null) {
                        Object obj = this.c;
                        if (!((ag) obj).x) {
                            try {
                                str = ((ag) obj).z().getResourceName(((ag) this.c).F);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(((ag) this.c).F) + " (" + str + ") for fragment " + this.c);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        Object obj2 = this.c;
                        int i2 = cdr.a;
                        obj2.getClass();
                        ag agVar2 = (ag) obj2;
                        cdz cdzVar = new cdz(agVar2, viewGroup);
                        cdr.d(cdzVar);
                        cdq b = cdr.b(agVar2);
                        if (b.b.contains(cdp.DETECT_WRONG_FRAGMENT_CONTAINER) && cdr.e(b, obj2.getClass(), cdzVar.getClass())) {
                            cdr.c(b, cdzVar);
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + this.c + " for a container view with no id");
                }
            }
        }
        ag agVar3 = (ag) this.c;
        agVar3.O = viewGroup;
        agVar3.n(I, viewGroup, bundle);
        if (((ag) this.c).P != null) {
            if (be.Z(3)) {
                Objects.toString(this.c);
            }
            ((ag) this.c).P.setSaveFromParentEnabled(false);
            Object obj3 = this.c;
            ((ag) obj3).P.setTag(R.id.fragment_container_view_tag, obj3);
            if (viewGroup != null) {
                c();
            }
            ag agVar4 = (ag) this.c;
            if (agVar4.H) {
                agVar4.P.setVisibility(8);
            }
            if (((ag) this.c).P.isAttachedToWindow()) {
                bvz.c(((ag) this.c).P);
            } else {
                View view = ((ag) this.c).P;
                view.addOnAttachStateChangeListener(new fz(view, 1));
            }
            ((ag) this.c).ah();
            Object obj4 = this.b;
            ag agVar5 = (ag) this.c;
            ((bfi) obj4).B(agVar5, agVar5.P, bundle, false);
            int visibility = ((ag) this.c).P.getVisibility();
            ((ag) this.c).B().l = ((ag) this.c).P.getAlpha();
            ag agVar6 = (ag) this.c;
            if (agVar6.O != null && visibility == 0) {
                View findFocus = agVar6.P.findFocus();
                if (findFocus != null) {
                    ((ag) this.c).al(findFocus);
                    if (be.Z(2)) {
                        Objects.toString(findFocus);
                        Objects.toString(this.c);
                    }
                }
                ((ag) this.c).P.setAlpha(0.0f);
            }
        }
        ((ag) this.c).g = 2;
    }

    public final void e() {
        Bundle bundle;
        ag agVar = (ag) this.c;
        if (agVar.v && agVar.w && !agVar.y) {
            if (be.Z(3)) {
                Objects.toString(this.c);
            }
            Bundle bundle2 = ((ag) this.c).h;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            ag agVar2 = (ag) this.c;
            agVar2.n(agVar2.I(bundle), null, bundle);
            View view = ((ag) this.c).P;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Object obj = this.c;
                ((ag) obj).P.setTag(R.id.fragment_container_view_tag, obj);
                ag agVar3 = (ag) this.c;
                if (agVar3.H) {
                    agVar3.P.setVisibility(8);
                }
                ((ag) this.c).ah();
                Object obj2 = this.b;
                ag agVar4 = (ag) this.c;
                ((bfi) obj2).B(agVar4, agVar4.P, bundle, false);
                ((ag) this.c).g = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x04b0, code lost:            r12.f();     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x056f, code lost:            continue;     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x07e5, code lost:            if (r5 != false) goto L738;     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x056f, code lost:            continue;     */
    /* JADX WARN: Type inference failed for: r4v108, types: [cfc, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 2594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fil.f():void");
    }

    public final void g(ClassLoader classLoader) {
        Bundle bundle = ((ag) this.c).h;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (((ag) this.c).h.getBundle("savedInstanceState") == null) {
                ((ag) this.c).h.putBundle("savedInstanceState", new Bundle());
            }
            try {
                Object obj = this.c;
                ((ag) obj).i = ((ag) obj).h.getSparseParcelableArray("viewState");
                ag agVar = (ag) this.c;
                agVar.j = agVar.h.getBundle("viewRegistryState");
                bk bkVar = (bk) ((ag) this.c).h.getParcelable("state");
                if (bkVar != null) {
                    ag agVar2 = (ag) this.c;
                    agVar2.o = bkVar.l;
                    agVar2.p = bkVar.m;
                    Boolean bool = agVar2.k;
                    if (bool != null) {
                        agVar2.R = bool.booleanValue();
                        ((ag) this.c).k = null;
                    } else {
                        agVar2.R = bkVar.n;
                    }
                }
                ag agVar3 = (ag) this.c;
                if (!agVar3.R) {
                    agVar3.Q = true;
                }
            } catch (BadParcelableException e) {
                Object obj2 = this.c;
                Objects.toString(obj2);
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment ".concat(String.valueOf(obj2)), e);
            }
        }
    }

    final void h() {
        if (((ag) this.c).P != null) {
            if (be.Z(2)) {
                Objects.toString(this.c);
                Objects.toString(((ag) this.c).P);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            ((ag) this.c).P.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                ((ag) this.c).i = sparseArray;
            }
            Bundle bundle = new Bundle();
            ((ag) this.c).Y.b.f(bundle);
            if (!bundle.isEmpty()) {
                ((ag) this.c).j = bundle;
            }
        }
    }

    public fil(bfi bfiVar, bl blVar, ag agVar, Bundle bundle) {
        this.e = false;
        this.a = -1;
        this.b = bfiVar;
        this.d = blVar;
        this.c = agVar;
        agVar.i = null;
        agVar.j = null;
        agVar.z = 0;
        agVar.w = false;
        agVar.r = false;
        ag agVar2 = agVar.n;
        agVar.o = agVar2 != null ? agVar2.l : null;
        agVar.n = null;
        agVar.h = bundle;
        agVar.m = bundle.getBundle("arguments");
    }

    public fil(bfi bfiVar, bl blVar, ClassLoader classLoader, am amVar, Bundle bundle) {
        this.e = false;
        this.a = -1;
        this.b = bfiVar;
        this.d = blVar;
        bk bkVar = (bk) bundle.getParcelable("state");
        ag b = amVar.b(bkVar.a);
        b.l = bkVar.b;
        b.v = bkVar.c;
        b.x = true;
        b.E = bkVar.d;
        b.F = bkVar.e;
        b.G = bkVar.f;
        b.J = bkVar.g;
        b.s = bkVar.h;
        b.I = bkVar.i;
        b.H = bkVar.j;
        b.X = cew.values()[bkVar.k];
        b.o = bkVar.l;
        b.p = bkVar.m;
        b.R = bkVar.n;
        this.c = b;
        b.h = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        b.ak(bundle2);
        if (be.Z(2)) {
            Objects.toString(b);
        }
    }

    public fil(Iterable iterable) {
        this.c = new rx();
        this.d = new bym((int[]) null);
        this.e = false;
        this.b = new rx();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            fhu fhuVar = (fhu) it.next();
            ((ta) this.b).put(fhuVar.c(), null);
        }
        this.a = ((rx) this.b).keySet().size();
    }
}
