package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import androidx.compose.foundation.layout.WrapContentElement;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ce {
    private static Field a;
    private static boolean b;
    private static Class c;
    private static boolean d;
    private static Field e;
    private static boolean f;
    private static Field g;
    private static boolean h;

    public ce(bmw bmwVar) {
        new WeakReference(bmwVar);
        bmo.o(bmwVar.K);
        bmo.o(bmwVar.L);
        bmo.o(bmwVar.M);
        bmo.o(bmwVar.N);
        bmo.o(bmwVar.O);
    }

    static SparseArray a(Bundle bundle, String str, Class cls) {
        SparseArray sparseParcelableArray;
        sparseParcelableArray = bundle.getSparseParcelableArray(str, cls);
        return sparseParcelableArray;
    }

    static Serializable b(Bundle bundle, String str, Class cls) {
        Serializable serializable;
        serializable = bundle.getSerializable(str, cls);
        return serializable;
    }

    public static Object c(Bundle bundle, String str, Class cls) {
        Object parcelable;
        parcelable = bundle.getParcelable(str, cls);
        return parcelable;
    }

    static ArrayList d(Bundle bundle, String str, Class cls) {
        ArrayList parcelableArrayList;
        parcelableArrayList = bundle.getParcelableArrayList(str, cls);
        return parcelableArrayList;
    }

    static Object[] e(Bundle bundle, String str, Class cls) {
        Object[] parcelableArray;
        parcelableArray = bundle.getParcelableArray(str, cls);
        return parcelableArray;
    }

    public static void f(Resources resources) {
        Map map;
        if (!b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            b = true;
        }
        Field field = a;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    public static void g(Resources resources) {
        if (!b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            b = true;
        }
        Field field = a;
        Object obj = null;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
        }
        if (obj == null) {
            return;
        }
        p(obj);
    }

    public static void h(Resources resources) {
        Object obj;
        if (!h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            h = true;
        }
        Field field = g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
                obj = null;
            }
            if (obj != null) {
                if (!b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                    }
                    b = true;
                }
                Field field2 = a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e5) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                    }
                }
                if (obj2 != null) {
                    p(obj2);
                }
            }
        }
    }

    public static final ym i(float f2) {
        yn ynVar = new yn(f2);
        return new ym(ynVar, ynVar, ynVar, ynVar);
    }

    public static final WrapContentElement j(aop aopVar) {
        return new WrapContentElement(new yj(aopVar, 0), aopVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x002c. Please report as an issue. */
    public static final void k(Context context, int i, SparseArray sparseArray, SparseArray sparseArray2) {
        char c2;
        int i2;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            bnz bnzVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    int i3 = -1;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    if (c2 != 2) {
                        if (c2 != 3) {
                            if (c2 == 4) {
                                boh bohVar = new boh();
                                int attributeCount = xml.getAttributeCount();
                                for (int i4 = 0; i4 < attributeCount; i4++) {
                                    String attributeName = xml.getAttributeName(i4);
                                    String attributeValue = xml.getAttributeValue(i4);
                                    if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                                        if (attributeValue.contains("/")) {
                                            i2 = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                                        } else {
                                            i2 = -1;
                                        }
                                        if (i2 == -1) {
                                            if (attributeValue.length() > 1) {
                                                i3 = Integer.parseInt(attributeValue.substring(1));
                                            } else {
                                                Log.e("ConstraintLayoutStates", "error in parsing id");
                                            }
                                        } else {
                                            i3 = i2;
                                        }
                                        bohVar.h(context, xml);
                                        sparseArray2.put(i3, bohVar);
                                    }
                                }
                            }
                        } else {
                            boa boaVar = new boa(context, xml);
                            if (bnzVar != null) {
                                bnzVar.b.add(boaVar);
                            }
                        }
                    } else {
                        bnz bnzVar2 = new bnz(context, xml);
                        sparseArray.put(bnzVar2.a, bnzVar2);
                        bnzVar = bnzVar2;
                    }
                }
            }
        } catch (IOException e2) {
            Log.e("ConstraintLayoutStates", a.ae(i, "Error parsing resource: "), e2);
        } catch (XmlPullParserException e3) {
            Log.e("ConstraintLayoutStates", a.ae(i, "Error parsing resource: "), e3);
        }
    }

    public static bnr l(bmw bmwVar, int i, ArrayList arrayList, bnr bnrVar) {
        int i2;
        int i3;
        int i4;
        if (i == 0) {
            i2 = bmwVar.ap;
        } else {
            i2 = bmwVar.aq;
        }
        if (i2 != -1 && (bnrVar == null || i2 != bnrVar.c)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                bnr bnrVar2 = (bnr) arrayList.get(i5);
                if (bnrVar2.c == i2) {
                    if (bnrVar != null) {
                        bnrVar.c(i, bnrVar2);
                        arrayList.remove(bnrVar);
                    }
                    bnrVar = bnrVar2;
                } else {
                    i5++;
                }
            }
        } else if (i2 != -1) {
            return bnrVar;
        }
        if (bnrVar == null) {
            if (bmwVar instanceof bnb) {
                bnb bnbVar = (bnb) bmwVar;
                int i6 = 0;
                while (true) {
                    if (i6 < bnbVar.aK) {
                        bmw bmwVar2 = bnbVar.aJ[i6];
                        if (i == 0) {
                            i4 = bmwVar2.ap;
                            if (i4 != -1) {
                                break;
                            }
                            i6++;
                        } else {
                            i4 = bmwVar2.aq;
                            if (i4 != -1) {
                                break;
                            }
                            i6++;
                        }
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                if (i4 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        bnr bnrVar3 = (bnr) arrayList.get(i7);
                        if (bnrVar3.c == i4) {
                            bnrVar = bnrVar3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (bnrVar == null) {
                bnrVar = new bnr(i);
            }
            arrayList.add(bnrVar);
        }
        if (bnrVar.d(bmwVar)) {
            if (bmwVar instanceof bna) {
                bna bnaVar = (bna) bmwVar;
                bmv bmvVar = bnaVar.d;
                if (bnaVar.as == 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                bmvVar.d(i3, arrayList, bnrVar);
            }
            if (i == 0) {
                bmwVar.ap = bnrVar.c;
                bmwVar.K.d(0, arrayList, bnrVar);
                bmwVar.M.d(0, arrayList, bnrVar);
            } else {
                bmwVar.aq = bnrVar.c;
                bmwVar.L.d(1, arrayList, bnrVar);
                bmwVar.O.d(1, arrayList, bnrVar);
                bmwVar.N.d(1, arrayList, bnrVar);
            }
            bmwVar.R.d(i, arrayList, bnrVar);
        }
        return bnrVar;
    }

    public static bnr m(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            bnr bnrVar = (bnr) arrayList.get(i2);
            if (i == bnrVar.c) {
                return bnrVar;
            }
        }
        return null;
    }

    public static boolean n(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        if (i3 != 1 && i3 != 2 && (i3 != 4 || i == 2)) {
            z = false;
        } else {
            z = true;
        }
        if (i4 != 1 && i4 != 2 && (i4 != 4 || i2 == 2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x029b, code lost:            if (r4.d == r7) goto L619;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0115, code lost:            if (r6.d == r5) goto L513;     */
    /* JADX WARN: Removed duplicated region for block: B:181:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0447 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x070c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0748 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0766 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x05c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x05bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void o(defpackage.bmx r39, defpackage.bmo r40, java.util.ArrayList r41, int r42) {
        /*
            Method dump skipped, instructions count: 1908
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ce.o(bmx, bmo, java.util.ArrayList, int):void");
    }

    private static void p(Object obj) {
        LongSparseArray longSparseArray;
        if (!d) {
            try {
                c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            d = true;
        }
        Class cls = c;
        if (cls != null) {
            if (!f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
                }
                f = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e4) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
