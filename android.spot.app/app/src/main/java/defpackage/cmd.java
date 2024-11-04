package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cmd implements Cloneable {
    private cma[] A;
    public ArrayList j;
    public ArrayList k;
    clz r;
    public bzw s;
    public static final Animator[] a = new Animator[0];
    private static final int[] w = {2, 1, 3, 4};
    private static final bzr D = new bzr();
    private static final ThreadLocal x = new ThreadLocal();
    private final String y = getClass().getName();
    public long b = -1;
    public long c = -1;
    public TimeInterpolator d = null;
    final ArrayList e = new ArrayList();
    final ArrayList f = new ArrayList();
    public ArrayList g = null;
    private ArrayList z = null;
    public eld u = new eld();
    public eld v = new eld();
    cmk h = null;
    public final int[] i = w;
    final ArrayList l = new ArrayList();
    public Animator[] m = a;
    int n = 0;
    private boolean B = false;
    boolean o = false;
    public cmd p = null;
    private ArrayList C = null;
    public ArrayList q = new ArrayList();
    public bzr t = D;

    private static void J(eld eldVar, View view, cmn cmnVar) {
        ((ta) eldVar.d).put(view, cmnVar);
        int id = view.getId();
        if (id >= 0) {
            if (((SparseArray) eldVar.b).indexOfKey(id) >= 0) {
                ((SparseArray) eldVar.b).put(id, null);
            } else {
                ((SparseArray) eldVar.b).put(id, view);
            }
        }
        String h = bwb.h(view);
        if (h != null) {
            if (((ta) eldVar.c).containsKey(h)) {
                ((ta) eldVar.c).put(h, null);
            } else {
                ((ta) eldVar.c).put(h, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (((sl) eldVar.a).a(itemIdAtPosition) >= 0) {
                    View view2 = (View) ((sl) eldVar.a).e(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        ((sl) eldVar.a).j(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                ((sl) eldVar.a).j(itemIdAtPosition, view);
            }
        }
    }

    private final void e(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                cmn cmnVar = new cmn(view);
                if (z) {
                    c(cmnVar);
                } else {
                    b(cmnVar);
                }
                cmnVar.c.add(this);
                m(cmnVar);
                if (z) {
                    J(this.u, view, cmnVar);
                } else {
                    J(this.v, view, cmnVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    e(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    private static boolean f(cmn cmnVar, cmn cmnVar2, String str) {
        Map map = cmnVar2.a;
        Object obj = cmnVar.a.get(str);
        Object obj2 = map.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj != null && obj2 != null) {
            return !obj.equals(obj2);
        }
        return true;
    }

    public static rx g() {
        ThreadLocal threadLocal = x;
        rx rxVar = (rx) threadLocal.get();
        if (rxVar == null) {
            rx rxVar2 = new rx();
            threadLocal.set(rxVar2);
            return rxVar2;
        }
        return rxVar;
    }

    public final void A(String str) {
        ArrayList arrayList = this.z;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(str)) {
            arrayList.add(str);
        }
        this.z = arrayList;
    }

    public final void B(cma cmaVar) {
        cmd cmdVar;
        ArrayList arrayList = this.C;
        if (arrayList != null) {
            if (!arrayList.remove(cmaVar) && (cmdVar = this.p) != null) {
                cmdVar.B(cmaVar);
            }
            if (this.C.size() == 0) {
                this.C = null;
            }
        }
    }

    public void C(long j) {
        this.c = j;
    }

    public void D(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void F(long j) {
        this.b = j;
    }

    public void G(bzw bzwVar) {
        this.s = null;
    }

    public void H(bzr bzrVar) {
        if (bzrVar == null) {
            this.t = D;
        } else {
            this.t = bzrVar;
        }
    }

    public void I(ViewGroup viewGroup, eld eldVar, eld eldVar2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        Animator animator;
        cmn cmnVar;
        int i;
        Animator animator2;
        cmn cmnVar2;
        rx g = g();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            cmn cmnVar3 = (cmn) arrayList.get(i2);
            cmn cmnVar4 = (cmn) arrayList2.get(i2);
            if (cmnVar3 != null && !cmnVar3.c.contains(this)) {
                cmnVar3 = null;
            }
            if (cmnVar4 != null && !cmnVar4.c.contains(this)) {
                cmnVar4 = null;
            }
            if ((cmnVar3 != null || cmnVar4 != null) && (cmnVar3 == null || cmnVar4 == null || w(cmnVar3, cmnVar4))) {
                Animator a2 = a(viewGroup, cmnVar3, cmnVar4);
                if (a2 != null) {
                    if (cmnVar4 != null) {
                        View view2 = cmnVar4.b;
                        String[] d = d();
                        if (d != null) {
                            cmn cmnVar5 = new cmn(view2);
                            cmn cmnVar6 = (cmn) ((ta) eldVar2.d).get(view2);
                            if (cmnVar6 != null) {
                                int i3 = 0;
                                while (i3 < d.length) {
                                    Map map = cmnVar5.a;
                                    Animator animator3 = a2;
                                    String str = d[i3];
                                    map.put(str, cmnVar6.a.get(str));
                                    i3++;
                                    a2 = animator3;
                                    d = d;
                                }
                            }
                            animator2 = a2;
                            int i4 = g.d;
                            int i5 = 0;
                            while (true) {
                                if (i5 < i4) {
                                    dkr dkrVar = (dkr) g.get((Animator) g.c(i5));
                                    if (dkrVar.c != null && dkrVar.a == view2) {
                                        if (((String) dkrVar.e).equals(this.y) && ((cmn) dkrVar.c).equals(cmnVar5)) {
                                            cmnVar2 = cmnVar5;
                                            animator2 = null;
                                            break;
                                        }
                                    }
                                    i5++;
                                } else {
                                    cmnVar2 = cmnVar5;
                                    break;
                                }
                            }
                        } else {
                            animator2 = a2;
                            cmnVar2 = null;
                        }
                        view = view2;
                        cmnVar = cmnVar2;
                        animator = animator2;
                    } else {
                        view = cmnVar3.b;
                        animator = a2;
                        cmnVar = null;
                    }
                    if (animator != null) {
                        i = size;
                        g.put(animator, new dkr(view, this.y, this, viewGroup.getWindowId(), cmnVar, animator));
                        this.q.add(animator);
                        i2++;
                        size = i;
                    }
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                dkr dkrVar2 = (dkr) g.get((Animator) this.q.get(sparseIntArray.keyAt(i6)));
                ((Animator) dkrVar2.d).setStartDelay((sparseIntArray.valueAt(i6) - Long.MAX_VALUE) + ((Animator) dkrVar2.d).getStartDelay());
            }
        }
    }

    public Animator a(ViewGroup viewGroup, cmn cmnVar, cmn cmnVar2) {
        return null;
    }

    public abstract void b(cmn cmnVar);

    public abstract void c(cmn cmnVar);

    public String[] d() {
        return null;
    }

    @Override // 
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public cmd clone() {
        try {
            cmd cmdVar = (cmd) super.clone();
            cmdVar.q = new ArrayList();
            cmdVar.u = new eld();
            cmdVar.v = new eld();
            cmdVar.j = null;
            cmdVar.k = null;
            cmdVar.r = null;
            cmdVar.p = this;
            cmdVar.C = null;
            return cmdVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final cmd i() {
        cmk cmkVar = this.h;
        if (cmkVar != null) {
            return cmkVar.i();
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cmn j(View view, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        cmk cmkVar = this.h;
        if (cmkVar != null) {
            return cmkVar.j(view, z);
        }
        if (z) {
            arrayList = this.j;
        } else {
            arrayList = this.k;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                cmn cmnVar = (cmn) arrayList.get(i);
                if (cmnVar == null) {
                    return null;
                }
                if (cmnVar.b == view) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return null;
        }
        if (z) {
            arrayList2 = this.k;
        } else {
            arrayList2 = this.j;
        }
        return (cmn) arrayList2.get(i);
    }

    public final cmn k(View view, boolean z) {
        eld eldVar;
        cmk cmkVar = this.h;
        if (cmkVar != null) {
            return cmkVar.k(view, z);
        }
        if (z) {
            eldVar = this.u;
        } else {
            eldVar = this.v;
        }
        return (cmn) ((ta) eldVar.d).get(view);
    }

    public String l(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.b != -1) {
            sb.append("dly(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        if (this.e.size() > 0 || this.f.size() > 0) {
            sb.append("tgts(");
            if (this.e.size() > 0) {
                for (int i = 0; i < this.e.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.e.get(i));
                }
            }
            if (this.f.size() > 0) {
                for (int i2 = 0; i2 < this.f.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(ViewGroup viewGroup, boolean z) {
        ArrayList arrayList;
        boolean z2;
        o(z);
        if ((this.e.size() <= 0 && this.f.size() <= 0) || ((arrayList = this.g) != null && !arrayList.isEmpty())) {
            e(viewGroup, z);
            return;
        }
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= this.e.size()) {
                break;
            }
            View findViewById = viewGroup.findViewById(((Integer) this.e.get(i)).intValue());
            if (findViewById != null) {
                cmn cmnVar = new cmn(findViewById);
                if (z) {
                    c(cmnVar);
                } else {
                    b(cmnVar);
                    z3 = false;
                }
                cmnVar.c.add(this);
                m(cmnVar);
                if (z3) {
                    J(this.u, findViewById, cmnVar);
                } else {
                    J(this.v, findViewById, cmnVar);
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            View view = (View) this.f.get(i2);
            cmn cmnVar2 = new cmn(view);
            if (z) {
                c(cmnVar2);
                z2 = true;
            } else {
                b(cmnVar2);
                z2 = false;
            }
            cmnVar2.c.add(this);
            m(cmnVar2);
            if (z2) {
                J(this.u, view, cmnVar2);
            } else {
                J(this.v, view, cmnVar2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(boolean z) {
        if (z) {
            ((ta) this.u.d).clear();
            ((SparseArray) this.u.b).clear();
            ((sl) this.u.a).i();
        } else {
            ((ta) this.v.d).clear();
            ((SparseArray) this.v.b).clear();
            ((sl) this.v.a).i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p() {
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            r(this, cmc.b, false);
            for (int i2 = 0; i2 < ((sl) this.u.a).b(); i2++) {
                View view = (View) ((sl) this.u.a).g(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((sl) this.v.a).b(); i3++) {
                View view2 = (View) ((sl) this.v.a).g(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.o = true;
        }
    }

    public void q(ViewGroup viewGroup) {
        rx g = g();
        int i = g.d;
        if (i != 0) {
            WindowId windowId = viewGroup.getWindowId();
            rx rxVar = new rx(g);
            g.clear();
            while (true) {
                i--;
                if (i >= 0) {
                    dkr dkrVar = (dkr) rxVar.f(i);
                    if (dkrVar.a != null && windowId.equals(dkrVar.b)) {
                        ((Animator) rxVar.c(i)).end();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void r(cmd cmdVar, cmc cmcVar, boolean z) {
        cmd cmdVar2 = this.p;
        if (cmdVar2 != null) {
            cmdVar2.r(cmdVar, cmcVar, false);
        }
        ArrayList arrayList = this.C;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.C.size();
            cma[] cmaVarArr = this.A;
            if (cmaVarArr == null) {
                cmaVarArr = new cma[size];
            }
            this.A = null;
            cma[] cmaVarArr2 = (cma[]) this.C.toArray(cmaVarArr);
            for (int i = 0; i < size; i++) {
                cmcVar.a(cmaVarArr2[i], cmdVar);
                cmaVarArr2[i] = null;
            }
            this.A = cmaVarArr2;
        }
    }

    public void s(View view) {
        if (!this.o) {
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.m);
            this.m = a;
            while (true) {
                size--;
                if (size >= 0) {
                    Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.pause();
                } else {
                    this.m = animatorArr;
                    r(this, cmc.d, false);
                    this.B = true;
                    return;
                }
            }
        }
    }

    public void t(View view) {
        if (this.B) {
            if (!this.o) {
                ArrayList arrayList = this.l;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.m);
                this.m = a;
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.resume();
                }
                this.m = animatorArr;
                r(this, cmc.e, false);
            }
            this.B = false;
        }
    }

    public final String toString() {
        return l("");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void u() {
        v();
        rx g = g();
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (g.containsKey(animator)) {
                v();
                if (animator != null) {
                    animator.addListener(new clw(this, g));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(j2 + animator.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new clx(this));
                    animator.start();
                }
            }
        }
        this.q.clear();
        p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v() {
        if (this.n == 0) {
            r(this, cmc.a, false);
            this.o = false;
        }
        this.n++;
    }

    public boolean w(cmn cmnVar, cmn cmnVar2) {
        if (cmnVar == null || cmnVar2 == null) {
            return false;
        }
        String[] d = d();
        if (d != null) {
            for (String str : d) {
                if (!f(cmnVar, cmnVar2, str)) {
                }
            }
            return false;
        }
        Iterator it = cmnVar.a.keySet().iterator();
        while (it.hasNext()) {
            if (f(cmnVar, cmnVar2, (String) it.next())) {
            }
        }
        return false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean x(View view) {
        ArrayList arrayList;
        int id = view.getId();
        if (this.z != null && bwb.h(view) != null && this.z.contains(bwb.h(view))) {
            return false;
        }
        if ((this.e.size() == 0 && this.f.size() == 0 && ((arrayList = this.g) == null || arrayList.isEmpty())) || this.e.contains(Integer.valueOf(id)) || this.f.contains(view)) {
            return true;
        }
        ArrayList arrayList2 = this.g;
        if (arrayList2 == null || !arrayList2.contains(bwb.h(view))) {
            return false;
        }
        return true;
    }

    public final void y(cma cmaVar) {
        if (this.C == null) {
            this.C = new ArrayList();
        }
        this.C.add(cmaVar);
    }

    public final void z(String str) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        this.g.add(str);
    }

    public void E() {
    }

    public void m(cmn cmnVar) {
    }
}
