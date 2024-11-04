package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ag implements ComponentCallbacks, View.OnCreateContextMenuListener, cfc, cgq, ces, cjz, pe {
    static final Object f = new Object();
    public be A;
    public an B;
    public ag D;
    public int E;
    public int F;
    public String G;
    public boolean H;
    public boolean I;
    public boolean J;
    boolean K;
    boolean L;
    public boolean N;
    public ViewGroup O;
    public View P;
    public boolean Q;
    public ac S;
    public boolean T;
    public LayoutInflater U;
    public boolean V;
    public String W;
    public bq Y;
    cgn aa;
    public cex ad;
    public drz ae;
    public Bundle h;
    public SparseArray i;
    public Bundle j;
    public Boolean k;
    public Bundle m;
    public ag n;
    public int p;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;
    public int g = -1;
    public String l = UUID.randomUUID().toString();
    public String o = null;
    public Boolean q = null;
    public be C = new be();
    boolean M = true;
    public boolean R = true;
    public cew X = cew.RESUMED;
    public final cfn Z = new cfn();
    public final AtomicInteger ab = new AtomicInteger();
    public final ArrayList ac = new ArrayList();
    private final ae a = new y(this);

    public ag() {
        o();
    }

    private final int a() {
        cew cewVar = this.X;
        if (cewVar != cew.INITIALIZED && this.D != null) {
            return Math.min(cewVar.ordinal(), this.D.a());
        }
        return cewVar.ordinal();
    }

    @Deprecated
    public static ag aB(Context context, String str) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            int i = am.a;
            try {
                return (ag) am.a(classLoader, str).getConstructor(null).newInstance(null);
            } catch (ClassCastException e) {
                throw new ad("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
            } catch (ClassNotFoundException e2) {
                throw new ad("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
            }
        } catch (IllegalAccessException e3) {
            throw new ad(a.ag(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (InstantiationException e4) {
            throw new ad(a.ag(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (NoSuchMethodException e5) {
            throw new ad(a.ag(str, "Unable to instantiate fragment ", ": could not find Fragment constructor"), e5);
        } catch (InvocationTargetException e6) {
            throw new ad(a.ag(str, "Unable to instantiate fragment ", ": calling Fragment constructor caused an exception"), e6);
        }
    }

    private final ag d(boolean z) {
        String str;
        if (z) {
            cdu cduVar = new cdu(this);
            cdr.d(cduVar);
            cdq b = cdr.b(this);
            if (b.b.contains(cdp.DETECT_TARGET_FRAGMENT_USAGE) && cdr.e(b, getClass(), cduVar.getClass())) {
                cdr.c(b, cduVar);
            }
        }
        ag agVar = this.n;
        if (agVar != null) {
            return agVar;
        }
        be beVar = this.A;
        if (beVar != null && (str = this.o) != null) {
            return beVar.c(str);
        }
        return null;
    }

    private final pf e(pn pnVar, qe qeVar, pd pdVar) {
        if (this.g <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            p(new ab(this, qeVar, atomicReference, pnVar, pdVar));
            return new x(atomicReference);
        }
        throw new IllegalStateException(a.af(this, "Fragment ", " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    private final void o() {
        this.ad = new cex(this);
        this.ae = new drz(this);
        this.aa = null;
        if (!this.ac.contains(this.a)) {
            p(this.a);
        }
    }

    private final void p(ae aeVar) {
        if (this.g >= 0) {
            aeVar.a();
        } else {
            this.ac.add(aeVar);
        }
    }

    public final Bundle A() {
        Bundle bundle = this.m;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(a.af(this, "Fragment ", " does not have any arguments."));
    }

    public final ac B() {
        if (this.S == null) {
            this.S = new ac();
        }
        return this.S;
    }

    @Deprecated
    public final ag C() {
        return d(true);
    }

    public final ag D() {
        ag agVar = this.D;
        if (agVar == null) {
            if (x() == null) {
                throw new IllegalStateException(a.af(this, "Fragment ", " is not attached to any Fragment or host"));
            }
            throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + x());
        }
        return agVar;
    }

    public final aj E() {
        an anVar = this.B;
        if (anVar == null) {
            return null;
        }
        return (aj) anVar.b;
    }

    public final aj F() {
        aj E = E();
        if (E != null) {
            return E;
        }
        throw new IllegalStateException(a.af(this, "Fragment ", " not attached to an activity."));
    }

    public final be G() {
        if (this.B != null) {
            return this.C;
        }
        throw new IllegalStateException(a.af(this, "Fragment ", " has not been attached yet."));
    }

    public final be H() {
        be beVar = this.A;
        if (beVar != null) {
            return beVar;
        }
        throw new IllegalStateException(a.af(this, "Fragment ", " not associated with a fragment manager."));
    }

    public final LayoutInflater I(Bundle bundle) {
        LayoutInflater cO = cO(bundle);
        this.U = cO;
        return cO;
    }

    public View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public final View K() {
        View view = this.P;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(a.af(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    @Override // defpackage.pe
    public final pf L(pn pnVar, pd pdVar) {
        return e(pnVar, new aa(this, 1), pdVar);
    }

    public final pf M(pn pnVar, pk pkVar, pd pdVar) {
        return e(pnVar, new aa(pkVar, 0), pdVar);
    }

    @Override // defpackage.cfc
    public final cex N() {
        return this.ad;
    }

    public final cfc O() {
        bq bqVar = this.Y;
        if (bqVar != null) {
            return bqVar;
        }
        throw new IllegalStateException(a.af(this, "Can't access the Fragment View's LifecycleOwner for ", " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    @Override // defpackage.ces
    public cgn P() {
        Application application;
        if (this.A != null) {
            if (this.aa == null) {
                Context applicationContext = y().getApplicationContext();
                while (true) {
                    if (applicationContext instanceof ContextWrapper) {
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                            break;
                        }
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    } else {
                        application = null;
                        break;
                    }
                }
                if (application == null && be.Z(3)) {
                    Objects.toString(y().getApplicationContext());
                }
                this.aa = new cgh(application, this, this.m);
            }
            return this.aa;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // defpackage.ces
    public final cgu Q() {
        Application application;
        Context applicationContext = y().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && be.Z(3)) {
            Objects.toString(y().getApplicationContext());
        }
        cgv cgvVar = new cgv();
        if (application != null) {
            cgvVar.b(cgm.b, application);
        }
        cgvVar.b(cge.a, this);
        cgvVar.b(cge.b, this);
        Bundle bundle = this.m;
        if (bundle != null) {
            cgvVar.b(cge.c, bundle);
        }
        return cgvVar;
    }

    @Override // defpackage.cjz
    public final cjy R() {
        return (cjy) this.ae.b;
    }

    public final Object S() {
        an anVar = this.B;
        if (anVar == null) {
            return null;
        }
        return ((ai) anVar).a;
    }

    public final String T(int i) {
        return z().getString(i);
    }

    public final String U(int i, Object... objArr) {
        return z().getString(i, objArr);
    }

    public void V(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.E));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.F));
        printWriter.print(" mTag=");
        printWriter.println(this.G);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.g);
        printWriter.print(" mWho=");
        printWriter.print(this.l);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.z);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.r);
        printWriter.print(" mRemoving=");
        printWriter.print(this.s);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.v);
        printWriter.print(" mInLayout=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.H);
        printWriter.print(" mDetached=");
        printWriter.print(this.I);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.M);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.L);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.J);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.R);
        if (this.A != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.A);
        }
        if (this.B != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.B);
        }
        if (this.D != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.D);
        }
        if (this.m != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.m);
        }
        if (this.h != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.h);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.i);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.j);
        }
        ag d = d(false);
        if (d != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(d);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.p);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(at());
        if (s() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(s());
        }
        if (t() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(t());
        }
        if (u() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(u());
        }
        if (v() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(v());
        }
        if (this.O != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.O);
        }
        if (this.P != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.P);
        }
        if (x() != null) {
            cgz.a(this).c(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.C + ":");
        this.C.E(str.concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final void W() {
        o();
        this.W = this.l;
        this.l = UUID.randomUUID().toString();
        this.r = false;
        this.s = false;
        this.v = false;
        this.w = false;
        this.x = false;
        this.z = 0;
        this.A = null;
        this.C = new be();
        this.B = null;
        this.E = 0;
        this.F = 0;
        this.G = null;
        this.H = false;
        this.I = false;
    }

    @Deprecated
    public void X(Bundle bundle) {
        this.N = true;
    }

    @Deprecated
    public void Y(int i, int i2, Intent intent) {
        if (be.Z(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    @Deprecated
    public void Z(Activity activity) {
        this.N = true;
    }

    @Deprecated
    public final LayoutInflater aA() {
        an anVar = this.B;
        if (anVar != null) {
            aj ajVar = ((ai) anVar).a;
            LayoutInflater cloneInContext = ajVar.getLayoutInflater().cloneInContext(ajVar);
            cloneInContext.setFactory2(this.C.c);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public final void aC(AttributeSet attributeSet, Bundle bundle) {
        Activity activity;
        this.N = true;
        an anVar = this.B;
        if (anVar == null) {
            activity = null;
        } else {
            activity = anVar.b;
        }
        if (activity != null) {
            this.N = false;
            ac(activity, attributeSet, bundle);
        }
    }

    @Deprecated
    public final void aD() {
        if (!this.L) {
            this.L = true;
            if (au() && !av()) {
                this.B.e();
            }
        }
    }

    @Override // defpackage.cgq
    public final ddh aE() {
        if (this.A != null) {
            if (a() != cew.INITIALIZED.ordinal()) {
                bg bgVar = this.A.w;
                ddh ddhVar = (ddh) bgVar.d.get(this.l);
                if (ddhVar == null) {
                    ddh ddhVar2 = new ddh((byte[]) null, (char[]) null);
                    bgVar.d.put(this.l, ddhVar2);
                    return ddhVar2;
                }
                return ddhVar;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public void ab() {
        this.N = true;
    }

    @Deprecated
    public void ac(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.N = true;
    }

    public void ad() {
        this.N = true;
    }

    public void af() {
        this.N = true;
    }

    public final void ah() {
        Bundle bundle;
        Bundle bundle2 = this.h;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        ag(this.P, bundle);
        this.C.C(2);
    }

    public final void ai() {
        Bundle bundle;
        Bundle bundle2 = this.h;
        if (bundle2 != null && (bundle = bundle2.getBundle("childFragmentManager")) != null) {
            this.C.N(bundle);
            this.C.r();
        }
    }

    public final void aj(int i, int i2, int i3, int i4) {
        if (this.S == null && i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 == 0) {
                    if (i4 != 0) {
                        i2 = 0;
                        i3 = 0;
                    } else {
                        return;
                    }
                } else {
                    i2 = 0;
                }
            }
        }
        B().b = i;
        B().c = i2;
        B().d = i3;
        B().e = i4;
    }

    public final void ak(Bundle bundle) {
        if (this.A != null && ax()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.m = bundle;
    }

    public final void al(View view) {
        B().m = view;
    }

    public final void am(boolean z) {
        if (this.M != z) {
            this.M = z;
            if (this.L && au() && !av()) {
                this.B.e();
            }
        }
    }

    public final void an(int i) {
        if (this.S == null && i == 0) {
            return;
        }
        B();
        this.S.f = i;
    }

    public final void ao(boolean z) {
        if (this.S == null) {
            return;
        }
        B().a = z;
    }

    public final void ap(ArrayList arrayList, ArrayList arrayList2) {
        B();
        ac acVar = this.S;
        acVar.g = arrayList;
        acVar.h = arrayList2;
    }

    @Deprecated
    public final void aq(ag agVar, int i) {
        cdv cdvVar = new cdv(this, agVar, i);
        cdr.d(cdvVar);
        cdq b = cdr.b(this);
        if (b.b.contains(cdp.DETECT_TARGET_FRAGMENT_USAGE) && cdr.e(b, getClass(), cdvVar.getClass())) {
            cdr.c(b, cdvVar);
        }
        be beVar = this.A;
        be beVar2 = agVar.A;
        if (beVar != null && beVar2 != null && beVar != beVar2) {
            throw new IllegalArgumentException(a.af(agVar, "Fragment ", " must share the same FragmentManager to be set as a target fragment"));
        }
        for (ag agVar2 = agVar; agVar2 != null; agVar2 = agVar2.d(false)) {
            if (agVar2.equals(this)) {
                throw new IllegalArgumentException("Setting " + agVar + " as the target of " + this + " would create a target cycle");
            }
        }
        if (this.A != null && agVar.A != null) {
            this.o = agVar.l;
            this.n = null;
        } else {
            this.o = null;
            this.n = agVar;
        }
        this.p = i;
    }

    @Deprecated
    public final void ar(boolean z) {
        be beVar;
        cdw cdwVar = new cdw(this, z);
        cdr.d(cdwVar);
        cdq b = cdr.b(this);
        if (b.b.contains(cdp.DETECT_SET_USER_VISIBLE_HINT) && cdr.e(b, getClass(), cdwVar.getClass())) {
            cdr.c(b, cdwVar);
        }
        if (!this.R && z && this.g < 5 && (beVar = this.A) != null && au() && this.V) {
            beVar.ao(beVar.an(this));
        }
        this.R = z;
        boolean z2 = false;
        if (this.g < 5 && !z) {
            z2 = true;
        }
        this.Q = z2;
        if (this.h != null) {
            this.k = Boolean.valueOf(z);
        }
    }

    public final void as(Intent intent) {
        an anVar = this.B;
        if (anVar != null) {
            anVar.g(intent, -1);
            return;
        }
        throw new IllegalStateException(a.af(this, "Fragment ", " not attached to Activity"));
    }

    public final boolean at() {
        ac acVar = this.S;
        if (acVar == null) {
            return false;
        }
        return acVar.a;
    }

    public final boolean au() {
        if (this.B != null && this.r) {
            return true;
        }
        return false;
    }

    public final boolean av() {
        ag agVar;
        if (this.H) {
            return true;
        }
        if (this.A != null && (agVar = this.D) != null && agVar.av()) {
            return true;
        }
        return false;
    }

    public final boolean aw() {
        if (this.z > 0) {
            return true;
        }
        return false;
    }

    public final boolean ax() {
        be beVar = this.A;
        if (beVar == null) {
            return false;
        }
        return beVar.ac();
    }

    @Deprecated
    public boolean ay(MenuItem menuItem) {
        return false;
    }

    public final boolean az(String str) {
        an anVar = this.B;
        if (anVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        aj ajVar = ((ai) anVar).a;
        if (Build.VERSION.SDK_INT >= 32) {
            return boz.a(ajVar, str);
        }
        if (Build.VERSION.SDK_INT == 31) {
            return boy.b(ajVar, str);
        }
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        return box.c(ajVar, str);
    }

    public LayoutInflater cO(Bundle bundle) {
        return aA();
    }

    public void ct() {
        this.N = true;
    }

    public al cw() {
        return new z(this);
    }

    public void f(Context context) {
        Activity activity;
        this.N = true;
        an anVar = this.B;
        if (anVar == null) {
            activity = null;
        } else {
            activity = anVar.b;
        }
        if (activity != null) {
            this.N = false;
            Z(activity);
        }
    }

    public void g(Bundle bundle) {
        this.N = true;
        ai();
        be beVar = this.C;
        if (beVar.l > 0) {
            return;
        }
        beVar.r();
    }

    public void h() {
        this.N = true;
    }

    public void k() {
        this.N = true;
    }

    public void l() {
        this.N = true;
    }

    public void m(Bundle bundle) {
        this.N = true;
    }

    public void n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.C.K();
        this.y = true;
        this.Y = new bq(this, aE(), new w(this, 0));
        View J = J(layoutInflater, viewGroup, bundle);
        this.P = J;
        if (J != null) {
            this.Y.b();
            if (be.Z(3)) {
                Objects.toString(this.P);
                toString();
            }
            bty.e(this.P, this.Y);
            buu.g(this.P, this.Y);
            bza.d(this.P, this.Y);
            this.Z.l(this.Y);
            return;
        }
        if (this.Y.a == null) {
            this.Y = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.N = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        F().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.N = true;
    }

    public final int s() {
        ac acVar = this.S;
        if (acVar == null) {
            return 0;
        }
        return acVar.b;
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i) {
        if (this.B != null) {
            be H = H();
            if (H.q != null) {
                H.r.addLast(new ay(this.l, i));
                H.q.b(intent);
                return;
            }
            H.m.g(intent, i);
            return;
        }
        throw new IllegalStateException(a.af(this, "Fragment ", " not attached to Activity"));
    }

    public final int t() {
        ac acVar = this.S;
        if (acVar == null) {
            return 0;
        }
        return acVar.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.l);
        if (this.E != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.E));
        }
        if (this.G != null) {
            sb.append(" tag=");
            sb.append(this.G);
        }
        sb.append(")");
        return sb.toString();
    }

    public final int u() {
        ac acVar = this.S;
        if (acVar == null) {
            return 0;
        }
        return acVar.d;
    }

    public final int v() {
        ac acVar = this.S;
        if (acVar == null) {
            return 0;
        }
        return acVar.e;
    }

    @Deprecated
    public final int w() {
        cdt cdtVar = new cdt(this);
        cdr.d(cdtVar);
        cdq b = cdr.b(this);
        if (b.b.contains(cdp.DETECT_TARGET_FRAGMENT_USAGE) && cdr.e(b, getClass(), cdtVar.getClass())) {
            cdr.c(b, cdtVar);
        }
        return this.p;
    }

    public Context x() {
        an anVar = this.B;
        if (anVar == null) {
            return null;
        }
        return anVar.c;
    }

    public final Context y() {
        Context x = x();
        if (x != null) {
            return x;
        }
        throw new IllegalStateException(a.af(this, "Fragment ", " not attached to a context."));
    }

    public final Resources z() {
        return y().getResources();
    }

    @Deprecated
    public void ae(Menu menu) {
    }

    public void j(Bundle bundle) {
    }

    @Deprecated
    public void aa(Menu menu, MenuInflater menuInflater) {
    }

    public void ag(View view, Bundle bundle) {
    }
}
