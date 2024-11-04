package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gh implements bsp {
    private static final int[] l = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public gf b;
    public final ArrayList c;
    public final ArrayList d;
    CharSequence e;
    Drawable f;
    View g;
    public gj j;
    public boolean k;
    private final Resources m;
    private boolean n;
    private final boolean o;
    private final ArrayList p;
    private boolean q;
    private final ArrayList r;
    private boolean s;
    private int t = 0;
    public boolean h = false;
    private boolean u = false;
    private boolean v = false;
    private boolean w = false;
    private final ArrayList x = new ArrayList();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    private boolean y = false;

    public gh(Context context) {
        Resources resources;
        int d;
        boolean z = false;
        this.a = context;
        Resources resources2 = context.getResources();
        this.m = resources2;
        this.c = new ArrayList();
        this.p = new ArrayList();
        this.q = true;
        this.d = new ArrayList();
        this.r = new ArrayList();
        this.s = true;
        if (resources2.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT < 28 ? !((d = bws.d((resources = context.getResources()), "config_showMenuShortcutsWhenKeyboardPresent", "bool")) == 0 || !resources.getBoolean(d)) : bwq.b(viewConfiguration)) {
                z = true;
            }
        }
        this.o = z;
    }

    private final void E(int i, boolean z) {
        if (i >= 0 && i < this.c.size()) {
            this.c.remove(i);
            if (z) {
                l(true);
            }
        }
    }

    public final boolean A(MenuItem menuItem, gt gtVar, int i) {
        boolean z;
        boolean z2;
        gj gjVar = (gj) menuItem;
        if (gjVar != null && gjVar.isEnabled()) {
            boolean n = gjVar.n();
            bqj bqjVar = gjVar.p;
            if (bqjVar != null && bqjVar.c()) {
                z = true;
            } else {
                z = false;
            }
            if (gjVar.m()) {
                n |= gjVar.expandActionView();
                if (n) {
                    i(true);
                    return true;
                }
            } else if (!gjVar.hasSubMenu() && !z) {
                if ((i & 1) == 0) {
                    i(true);
                    return n;
                }
            } else {
                if ((i & 4) == 0) {
                    i(false);
                }
                if (!gjVar.hasSubMenu()) {
                    gjVar.l(new ha(this.a, this, gjVar));
                }
                ha haVar = gjVar.k;
                if (z) {
                    bqjVar.b(haVar);
                }
                if (this.i.isEmpty()) {
                    z2 = false;
                } else {
                    if (gtVar != null) {
                        z2 = gtVar.h(haVar);
                    } else {
                        z2 = false;
                    }
                    Iterator it = this.i.iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        gt gtVar2 = (gt) weakReference.get();
                        if (gtVar2 == null) {
                            this.i.remove(weakReference);
                        } else if (!z2) {
                            z2 = gtVar2.h(haVar);
                        }
                    }
                }
                n |= z2;
                if (!n) {
                    i(true);
                }
            }
            return n;
        }
        return false;
    }

    public final void B() {
        this.s = true;
        l(true);
    }

    public final void C() {
        this.q = true;
        l(true);
    }

    public final void D() {
        this.t = 1;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return c(0, 0, 0, this.m.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < i5; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            if (resolveInfo.specificIndex < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[resolveInfo.specificIndex];
            }
            Intent intent3 = new Intent(intent2);
            intent3.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem c = c(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c.setIcon(resolveInfo.loadIcon(packageManager));
            ((gj) c).e = intent3;
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = c;
            }
        }
        return i5;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.m.getString(i));
    }

    final gj b(int i, KeyEvent keyEvent) {
        char c;
        ArrayList arrayList = this.x;
        arrayList.clear();
        j(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (gj) arrayList.get(0);
        }
        boolean x = x();
        for (int i2 = 0; i2 < size; i2++) {
            gj gjVar = (gj) arrayList.get(i2);
            if (x) {
                c = gjVar.h;
            } else {
                c = gjVar.f;
            }
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (x && c == '\b' && i == 67))) {
                return gjVar;
            }
        }
        return null;
    }

    public MenuItem c(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = i3 >> 16;
        if (i5 >= 0 && i5 < 6) {
            int i6 = (l[i5] << 16) | ((char) i3);
            gj gjVar = new gj(this, i, i2, i3, i6, charSequence, this.t);
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (((gj) arrayList.get(size)).c <= i6) {
                        i4 = size + 1;
                        break;
                    }
                } else {
                    i4 = 0;
                    break;
                }
            }
            arrayList.add(i4, gjVar);
            l(true);
            return gjVar;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final void clear() {
        gj gjVar = this.j;
        if (gjVar != null) {
            t(gjVar);
        }
        this.c.clear();
        l(true);
    }

    public final void clearHeader() {
        this.f = null;
        this.e = null;
        this.g = null;
        l(false);
    }

    @Override // android.view.Menu
    public final void close() {
        i(true);
    }

    protected String d() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList e() {
        k();
        return this.r;
    }

    public final ArrayList f() {
        if (!this.q) {
            return this.p;
        }
        this.p.clear();
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            gj gjVar = (gj) this.c.get(i);
            if (gjVar.isVisible()) {
                this.p.add(gjVar);
            }
        }
        this.q = false;
        this.s = true;
        return this.p;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            gj gjVar = (gj) this.c.get(i2);
            if (gjVar.a == i) {
                return gjVar;
            }
            if (gjVar.hasSubMenu() && (findItem = gjVar.k.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final void g(gt gtVar) {
        h(gtVar, this.a);
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.c.get(i);
    }

    public final void h(gt gtVar, Context context) {
        this.i.add(new WeakReference(gtVar));
        gtVar.c(context, this);
        this.s = true;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.k) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((gj) this.c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z) {
        if (this.w) {
            return;
        }
        this.w = true;
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            gt gtVar = (gt) weakReference.get();
            if (gtVar == null) {
                this.i.remove(weakReference);
            } else {
                gtVar.d(this, z);
            }
        }
        this.w = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        if (b(i, keyEvent) != null) {
            return true;
        }
        return false;
    }

    final void j(List list, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean x = x();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData)) {
            if (i == 67) {
                i = 67;
            } else {
                return;
            }
        }
        int size = this.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            gj gjVar = (gj) this.c.get(i3);
            if (gjVar.hasSubMenu()) {
                gjVar.k.j(list, i, keyEvent);
            }
            if (x) {
                c = gjVar.h;
            } else {
                c = gjVar.f;
            }
            if (x) {
                i2 = gjVar.i;
            } else {
                i2 = gjVar.g;
            }
            if ((modifiers & 69647) == (i2 & 69647) && c != 0 && ((c == keyData.meta[0] || c == keyData.meta[2] || (x && c == '\b' && i == 67)) && gjVar.isEnabled())) {
                list.add(gjVar);
            }
        }
    }

    public final void k() {
        ArrayList f = f();
        if (!this.s) {
            return;
        }
        Iterator it = this.i.iterator();
        boolean z = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            gt gtVar = (gt) weakReference.get();
            if (gtVar == null) {
                this.i.remove(weakReference);
            } else {
                z |= gtVar.g();
            }
        }
        if (z) {
            this.d.clear();
            this.r.clear();
            int size = f.size();
            for (int i = 0; i < size; i++) {
                gj gjVar = (gj) f.get(i);
                if (gjVar.o()) {
                    this.d.add(gjVar);
                } else {
                    this.r.add(gjVar);
                }
            }
        } else {
            this.d.clear();
            this.r.clear();
            this.r.addAll(f());
        }
        this.s = false;
    }

    public final void l(boolean z) {
        boolean z2 = true;
        if (!this.h) {
            if (z) {
                this.q = true;
                this.s = true;
            } else {
                z2 = false;
            }
            if (!this.i.isEmpty()) {
                s();
                Iterator it = this.i.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    gt gtVar = (gt) weakReference.get();
                    if (gtVar == null) {
                        this.i.remove(weakReference);
                    } else {
                        gtVar.f(z2);
                    }
                }
                r();
                return;
            }
            return;
        }
        this.u = true;
        if (z) {
            this.v = true;
        }
    }

    public final void m(gt gtVar) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            gt gtVar2 = (gt) weakReference.get();
            if (gtVar2 == null || gtVar2 == gtVar) {
                this.i.remove(weakReference);
            }
        }
    }

    public final void n(Bundle bundle) {
        MenuItem findItem;
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(d());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((ha) item.getSubMenu()).n(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 > 0 && (findItem = findItem(i2)) != null) {
            findItem.expandActionView();
        }
    }

    public final void o(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((ha) item.getSubMenu()).o(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(d(), sparseArray);
        }
    }

    public void p(gf gfVar) {
        this.b = gfVar;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return z(findItem(i), i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        gj b = b(i, keyEvent);
        if (b != null) {
            z = z(b, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i(true);
        }
        return z;
    }

    public final void q(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.g = view;
            this.e = null;
            this.f = null;
        } else {
            if (i > 0) {
                this.e = this.m.getText(i);
            } else if (charSequence != null) {
                this.e = charSequence;
            }
            if (i2 > 0) {
                this.f = bqq.a(this.a, i2);
            } else if (drawable != null) {
                this.f = drawable;
            }
            this.g = null;
        }
        l(false);
    }

    public final void r() {
        this.h = false;
        if (this.u) {
            this.u = false;
            l(this.v);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (((gj) this.c.get(i2)).b == i) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            int size2 = this.c.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || ((gj) this.c.get(i2)).b != i) {
                    break;
                }
                E(i2, false);
                i3 = i4;
            }
            l(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (((gj) this.c.get(i2)).a == i) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        E(i2, true);
    }

    public final void s() {
        if (!this.h) {
            this.h = true;
            this.u = false;
            this.v = false;
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            gj gjVar = (gj) this.c.get(i2);
            if (gjVar.b == i) {
                gjVar.j(z2);
                gjVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.y = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            gj gjVar = (gj) this.c.get(i2);
            if (gjVar.b == i) {
                gjVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        int size = this.c.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            gj gjVar = (gj) this.c.get(i2);
            if (gjVar.b == i && gjVar.s(z)) {
                z2 = true;
            }
        }
        if (z2) {
            l(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.n = z;
        l(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.c.size();
    }

    public boolean t(gj gjVar) {
        boolean z = false;
        if (!this.i.isEmpty() && this.j == gjVar) {
            s();
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                gt gtVar = (gt) weakReference.get();
                if (gtVar == null) {
                    this.i.remove(weakReference);
                } else {
                    z = gtVar.i(gjVar);
                    if (z) {
                        break;
                    }
                }
            }
            r();
            if (z) {
                this.j = null;
            }
        }
        return z;
    }

    public boolean u(gh ghVar, MenuItem menuItem) {
        gf gfVar = this.b;
        if (gfVar != null && gfVar.J(ghVar, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean v(gj gjVar) {
        boolean z = false;
        if (this.i.isEmpty()) {
            return false;
        }
        s();
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            gt gtVar = (gt) weakReference.get();
            if (gtVar == null) {
                this.i.remove(weakReference);
            } else {
                z = gtVar.j(gjVar);
                if (z) {
                    break;
                }
            }
        }
        r();
        if (z) {
            this.j = gjVar;
        }
        return z;
    }

    public boolean w() {
        return this.y;
    }

    public boolean x() {
        return this.n;
    }

    public boolean y() {
        return this.o;
    }

    public final boolean z(MenuItem menuItem, int i) {
        return A(menuItem, null, i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return c(i, i2, i3, this.m.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.m.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return c(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        gj gjVar = (gj) c(i, i2, i3, charSequence);
        ha haVar = new ha(this.a, this, gjVar);
        gjVar.l(haVar);
        return haVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public gh a() {
        return this;
    }
}
