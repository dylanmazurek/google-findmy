package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class am {
    public static final /* synthetic */ int a = 0;
    private static final ta b = new ta();

    public static Class a(ClassLoader classLoader, String str) {
        ta taVar = b;
        ta taVar2 = (ta) taVar.get(classLoader);
        if (taVar2 == null) {
            taVar2 = new ta();
            taVar.put(classLoader, taVar2);
        }
        Class cls = (Class) taVar2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            taVar2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public ag b(String str) {
        throw null;
    }
}
