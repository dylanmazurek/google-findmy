package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class lki implements lko {
    public static final lki a = new lki(1);
    private final /* synthetic */ int b;

    public lki(int i) {
        this.b = i;
    }

    @Override // defpackage.lko
    public final lkn a(Class cls) {
        if (this.b != 0) {
            if (ljn.class.isAssignableFrom(cls)) {
                try {
                    Class asSubclass = cls.asSubclass(ljn.class);
                    ljn ljnVar = (ljn) ljn.z.get(asSubclass);
                    if (ljnVar == null) {
                        try {
                            Class.forName(asSubclass.getName(), true, asSubclass.getClassLoader());
                            ljnVar = (ljn) ljn.z.get(asSubclass);
                        } catch (ClassNotFoundException e) {
                            throw new IllegalStateException("Class initialization cannot fail.", e);
                        }
                    }
                    if (ljnVar == null) {
                        ljnVar = (ljn) ((ljn) llu.g(asSubclass)).z(6);
                        if (ljnVar != null) {
                            ljn.z.put(asSubclass, ljnVar);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    return (lkn) ljnVar.z(3);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e2);
                }
            }
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.lko
    public final boolean b(Class cls) {
        if (this.b != 0) {
            return ljn.class.isAssignableFrom(cls);
        }
        return false;
    }
}
