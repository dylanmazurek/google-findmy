package defpackage;

import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxc {
    public static void a(Window window, boolean z) {
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 256);
        window.setDecorFitsSystemWindows(z);
    }

    public static final boolean b(chj chjVar, int i, int i2) {
        if ((i <= i2 || !chjVar.i) && chjVar.h && !chjVar.j.contains(Integer.valueOf(i))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.Map, java.lang.Object] */
    public static final List c(ddh ddhVar, int i, int i2) {
        boolean z;
        mkw mkwVar;
        boolean z2;
        if (i == i2) {
            return mlx.a;
        }
        if (i2 > i) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        do {
            if (z) {
                if (i >= i2) {
                    return arrayList;
                }
            } else if (i <= i2) {
                return arrayList;
            }
            if (z) {
                TreeMap treeMap = (TreeMap) ddhVar.a.get(Integer.valueOf(i));
                if (treeMap != null) {
                    mkwVar = new mkw(treeMap, treeMap.descendingKeySet());
                }
                mkwVar = null;
            } else {
                TreeMap treeMap2 = (TreeMap) ddhVar.a.get(Integer.valueOf(i));
                if (treeMap2 != null) {
                    mkwVar = new mkw(treeMap2, treeMap2.keySet());
                }
                mkwVar = null;
            }
            if (mkwVar == null) {
                break;
            }
            Map map = (Map) mkwVar.a;
            Iterator it = ((Iterable) mkwVar.b).iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (z) {
                    if (i + 1 <= intValue && intValue <= i2) {
                        Object obj = map.get(Integer.valueOf(intValue));
                        obj.getClass();
                        arrayList.add(obj);
                        i = intValue;
                        z2 = true;
                        break;
                    }
                } else if (i2 <= intValue && intValue < i) {
                    Object obj2 = map.get(Integer.valueOf(intValue));
                    obj2.getClass();
                    arrayList.add(obj2);
                    i = intValue;
                    z2 = true;
                    break;
                    break;
                }
            }
            z2 = false;
        } while (z2);
        return null;
    }
}
