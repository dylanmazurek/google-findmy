package defpackage;

import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class f extends bn implements bb {
    final be a;
    boolean b;
    public int c;

    public f(be beVar) {
        beVar.i();
        an anVar = beVar.m;
        if (anVar != null) {
            anVar.c.getClassLoader();
        }
        this.c = -1;
        this.a = beVar;
    }

    public final void a(int i) {
        if (this.j) {
            if (be.Z(2)) {
                toString();
            }
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                bm bmVar = (bm) this.d.get(i2);
                ag agVar = bmVar.b;
                if (agVar != null) {
                    agVar.z += i;
                    if (be.Z(2)) {
                        Objects.toString(bmVar.b);
                        int i3 = bmVar.b.z;
                    }
                }
            }
        }
    }

    @Override // defpackage.bn
    public final void b() {
        s();
        this.a.H(this, false);
    }

    @Override // defpackage.bn
    public final void c() {
        s();
        this.a.H(this, true);
    }

    @Override // defpackage.bn
    public final void d(int i, ag agVar, String str, int i2) {
        String str2 = agVar.W;
        if (str2 != null) {
            cdr.a(agVar, str2);
        }
        Class<?> cls = agVar.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = agVar.G;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + agVar + ": was " + agVar.G + " now " + str);
                }
                agVar.G = str;
            }
            if (i != 0) {
                if (i != -1) {
                    int i3 = agVar.E;
                    if (i3 != 0 && i3 != i) {
                        throw new IllegalStateException("Can't change container ID of fragment " + agVar + ": was " + agVar.E + " now " + i);
                    }
                    agVar.E = i;
                    agVar.F = i;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + agVar + " with tag " + str + " to container view with no id");
                }
            }
            n(new bm(i2, agVar));
            agVar.A = this.a;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void e(String str, PrintWriter printWriter) {
        f(str, printWriter, true);
    }

    public final void f(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.l);
            printWriter.print(" mIndex=");
            printWriter.print(this.c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.b);
            if (this.i != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.i));
            }
            if (this.e != 0 || this.f != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (this.g != 0 || this.h != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (this.m != 0 || this.n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.m));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.n);
            }
            if (this.o != 0 || this.p != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.o));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.p);
            }
        }
        if (!this.d.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                bm bmVar = (bm) this.d.get(i);
                switch (bmVar.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + bmVar.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(bmVar.b);
                if (z) {
                    if (bmVar.d != 0 || bmVar.e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(bmVar.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(bmVar.e));
                    }
                    if (bmVar.f != 0 || bmVar.g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(bmVar.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(bmVar.g));
                    }
                }
            }
        }
    }

    @Override // defpackage.bb
    public final boolean g(ArrayList arrayList, ArrayList arrayList2) {
        if (be.Z(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (this.j) {
            this.a.b.add(this);
            return true;
        }
        return true;
    }

    @Override // defpackage.bn
    public final void h() {
        j(false);
    }

    @Override // defpackage.bn
    public final void i() {
        j(true);
    }

    final void j(boolean z) {
        if (!this.b) {
            if (be.Z(2)) {
                toString();
                PrintWriter printWriter = new PrintWriter(new bu());
                e("  ", printWriter);
                printWriter.close();
            }
            this.b = true;
            if (this.j) {
                this.c = this.a.g.getAndIncrement();
            } else {
                this.c = -1;
            }
            this.a.G(this, z);
            return;
        }
        throw new IllegalStateException("commit already called");
    }

    @Override // defpackage.bn
    public final void k(ag agVar) {
        be beVar = agVar.A;
        if (beVar != null && beVar != this.a) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + agVar.toString() + " is already attached to a FragmentManager.");
        }
        n(new bm(3, agVar));
    }

    @Override // defpackage.bn
    public final void l(ag agVar, cew cewVar) {
        if (agVar.A == this.a) {
            if (cewVar == cew.INITIALIZED && agVar.g >= 0) {
                throw new IllegalArgumentException(a.af(cewVar, "Cannot set maximum Lifecycle to ", " after the Fragment has been created"));
            }
            if (cewVar != cew.DESTROYED) {
                n(new bm(agVar, cewVar));
                return;
            }
            throw new IllegalArgumentException(a.af(cewVar, "Cannot set maximum Lifecycle to ", ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction."));
        }
        be beVar = this.a;
        Objects.toString(beVar);
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ".concat(beVar.toString()));
    }

    @Override // defpackage.bn
    public final void m(ag agVar) {
        be beVar;
        if (agVar != null && (beVar = agVar.A) != null && beVar != this.a) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + agVar.toString() + " is already attached to a FragmentManager.");
        }
        n(new bm(8, agVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.c >= 0) {
            sb.append(" #");
            sb.append(this.c);
        }
        if (this.l != null) {
            sb.append(" ");
            sb.append(this.l);
        }
        sb.append("}");
        return sb.toString();
    }
}
