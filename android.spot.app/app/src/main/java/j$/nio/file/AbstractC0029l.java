package j$.nio.file;

import j$.nio.file.attribute.C0003a;
import j$.nio.file.attribute.C0012j;
import j$.nio.file.attribute.C0014l;
import j$.nio.file.attribute.InterfaceC0008f;
import j$.nio.file.attribute.InterfaceC0011i;
import j$.util.C0049d;
import java.nio.file.LinkOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: j$.nio.file.l */
/* loaded from: classes2.dex */
public abstract class AbstractC0029l {
    public static final H a = new E(Object.class, "OVERFLOW");
    public static final H b = new E(Path.class, "ENTRY_CREATE");
    public static final H c = new E(Path.class, "ENTRY_DELETE");
    public static final H d = new E(Path.class, "ENTRY_MODIFY");

    public static Iterator a(j$.desugar.sun.nio.fs.o oVar) {
        return new q(oVar);
    }

    public static /* synthetic */ StandardOpenOption b(D d2) {
        StandardOpenOption standardOpenOption;
        StandardOpenOption standardOpenOption2;
        StandardOpenOption standardOpenOption3;
        StandardOpenOption standardOpenOption4;
        StandardOpenOption standardOpenOption5;
        StandardOpenOption standardOpenOption6;
        StandardOpenOption standardOpenOption7;
        StandardOpenOption standardOpenOption8;
        StandardOpenOption standardOpenOption9;
        StandardOpenOption standardOpenOption10;
        if (d2 == null) {
            return null;
        }
        if (d2 == D.READ) {
            standardOpenOption10 = StandardOpenOption.READ;
            return standardOpenOption10;
        }
        if (d2 == D.WRITE) {
            standardOpenOption9 = StandardOpenOption.WRITE;
            return standardOpenOption9;
        }
        if (d2 == D.APPEND) {
            standardOpenOption8 = StandardOpenOption.APPEND;
            return standardOpenOption8;
        }
        if (d2 == D.TRUNCATE_EXISTING) {
            standardOpenOption7 = StandardOpenOption.TRUNCATE_EXISTING;
            return standardOpenOption7;
        }
        if (d2 == D.CREATE) {
            standardOpenOption6 = StandardOpenOption.CREATE;
            return standardOpenOption6;
        }
        if (d2 == D.CREATE_NEW) {
            standardOpenOption5 = StandardOpenOption.CREATE_NEW;
            return standardOpenOption5;
        }
        if (d2 == D.DELETE_ON_CLOSE) {
            standardOpenOption4 = StandardOpenOption.DELETE_ON_CLOSE;
            return standardOpenOption4;
        }
        if (d2 == D.SPARSE) {
            standardOpenOption3 = StandardOpenOption.SPARSE;
            return standardOpenOption3;
        }
        if (d2 == D.SYNC) {
            standardOpenOption2 = StandardOpenOption.SYNC;
            return standardOpenOption2;
        }
        standardOpenOption = StandardOpenOption.DSYNC;
        return standardOpenOption;
    }

    public static Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Path) {
            return u.k((Path) obj);
        }
        if (s.m(obj)) {
            return t.k(s.d(obj));
        }
        return obj;
    }

    public static Class d(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == j$.adapter.b.y()) {
            return InterfaceC0008f.class;
        }
        if (cls == InterfaceC0008f.class) {
            return j$.adapter.b.y();
        }
        if (cls == j$.adapter.b.A()) {
            return j$.nio.file.attribute.E.class;
        }
        if (cls == j$.nio.file.attribute.E.class) {
            return j$.adapter.b.A();
        }
        if (cls == j$.adapter.b.B()) {
            return j$.nio.file.attribute.z.class;
        }
        if (cls == j$.nio.file.attribute.z.class) {
            return j$.adapter.b.B();
        }
        if (cls == C0012j.class) {
            return j$.adapter.b.C();
        }
        if (cls == j$.adapter.b.C()) {
            return C0012j.class;
        }
        if (cls == j$.nio.file.attribute.J.class) {
            return j$.adapter.b.D();
        }
        if (cls == j$.adapter.b.D()) {
            return j$.nio.file.attribute.J.class;
        }
        if (cls == C0003a.class) {
            return j$.adapter.b.z();
        }
        if (cls == j$.adapter.b.z()) {
            return C0003a.class;
        }
        C0049d.a("java.nio.file.attribute.FileAttributeView", cls);
        throw null;
    }

    public static Class e(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == j$.adapter.b.a()) {
            return InterfaceC0011i.class;
        }
        if (cls == InterfaceC0011i.class) {
            return j$.adapter.b.a();
        }
        if (cls == j$.adapter.b.r()) {
            return j$.nio.file.attribute.G.class;
        }
        if (cls == j$.nio.file.attribute.G.class) {
            return j$.adapter.b.r();
        }
        if (cls == C0014l.class) {
            return j$.adapter.b.v();
        }
        if (cls == j$.adapter.b.v()) {
            return C0014l.class;
        }
        C0049d.a("java.nio.file.attribute.BasicFileAttributes", cls);
        throw null;
    }

    public static Map f(Map map) {
        if (map != null && !map.isEmpty()) {
            HashMap hashMap = new HashMap();
            for (String str : map.keySet()) {
                hashMap.put(str, g(map.get(str)));
            }
            return hashMap;
        }
        return map;
    }

    public static Object g(Object obj) {
        if (j$.adapter.b.p(obj)) {
            try {
                return j$.nio.file.attribute.s.b(j$.adapter.b.i(obj));
            } catch (ClassCastException e) {
                C0049d.a("java.nio.file.attribute.FileTime", e);
                throw null;
            }
        }
        if (obj instanceof j$.nio.file.attribute.B) {
            try {
                return j$.nio.file.attribute.s.d((j$.nio.file.attribute.B) obj);
            } catch (ClassCastException e2) {
                C0049d.a("java.nio.file.attribute.FileTime", e2);
                throw null;
            }
        }
        return obj;
    }

    public static Set h(Set set) {
        if (set != null && !set.isEmpty()) {
            HashSet hashSet = new HashSet();
            Object next = set.iterator().next();
            if (next instanceof p) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    try {
                        hashSet.add(o.a((p) it.next()));
                    } catch (ClassCastException e) {
                        C0049d.a("java.nio.file.OpenOption", e);
                        throw null;
                    }
                }
                return hashSet;
            }
            if (j$.adapter.b.x(next)) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    try {
                        hashSet.add(C0031n.a(j$.adapter.b.e(it2.next())));
                    } catch (ClassCastException e2) {
                        C0049d.a("java.nio.file.OpenOption", e2);
                        throw null;
                    }
                }
                return hashSet;
            }
            C0049d.a("java.nio.file.OpenOption", next.getClass());
            throw null;
        }
        return set;
    }

    public static Set i(Set set) {
        PosixFilePermission posixFilePermission;
        PosixFilePermission posixFilePermission2;
        PosixFilePermission posixFilePermission3;
        PosixFilePermission posixFilePermission4;
        PosixFilePermission posixFilePermission5;
        PosixFilePermission posixFilePermission6;
        PosixFilePermission posixFilePermission7;
        PosixFilePermission posixFilePermission8;
        j$.nio.file.attribute.I i;
        PosixFilePermission posixFilePermission9;
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof j$.nio.file.attribute.I) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    j$.nio.file.attribute.I i2 = (j$.nio.file.attribute.I) it.next();
                    if (i2 == null) {
                        posixFilePermission9 = null;
                    } else {
                        posixFilePermission9 = i2 == j$.nio.file.attribute.I.OWNER_READ ? PosixFilePermission.OWNER_READ : i2 == j$.nio.file.attribute.I.OWNER_WRITE ? PosixFilePermission.OWNER_WRITE : i2 == j$.nio.file.attribute.I.OWNER_EXECUTE ? PosixFilePermission.OWNER_EXECUTE : i2 == j$.nio.file.attribute.I.GROUP_READ ? PosixFilePermission.GROUP_READ : i2 == j$.nio.file.attribute.I.GROUP_WRITE ? PosixFilePermission.GROUP_WRITE : i2 == j$.nio.file.attribute.I.GROUP_EXECUTE ? PosixFilePermission.GROUP_EXECUTE : i2 == j$.nio.file.attribute.I.OTHERS_READ ? PosixFilePermission.OTHERS_READ : i2 == j$.nio.file.attribute.I.OTHERS_WRITE ? PosixFilePermission.OTHERS_WRITE : PosixFilePermission.OTHERS_EXECUTE;
                    }
                    hashSet.add(posixFilePermission9);
                } catch (ClassCastException e) {
                    C0049d.a("java.nio.file.attribute.PosixFilePermission", e);
                    throw null;
                }
            }
            return hashSet;
        }
        if (j$.adapter.b.t(next)) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    PosixFilePermission j = j$.adapter.b.j(it2.next());
                    if (j == null) {
                        i = null;
                    } else {
                        posixFilePermission = PosixFilePermission.OWNER_READ;
                        if (j == posixFilePermission) {
                            i = j$.nio.file.attribute.I.OWNER_READ;
                        } else {
                            posixFilePermission2 = PosixFilePermission.OWNER_WRITE;
                            if (j == posixFilePermission2) {
                                i = j$.nio.file.attribute.I.OWNER_WRITE;
                            } else {
                                posixFilePermission3 = PosixFilePermission.OWNER_EXECUTE;
                                if (j == posixFilePermission3) {
                                    i = j$.nio.file.attribute.I.OWNER_EXECUTE;
                                } else {
                                    posixFilePermission4 = PosixFilePermission.GROUP_READ;
                                    if (j == posixFilePermission4) {
                                        i = j$.nio.file.attribute.I.GROUP_READ;
                                    } else {
                                        posixFilePermission5 = PosixFilePermission.GROUP_WRITE;
                                        if (j == posixFilePermission5) {
                                            i = j$.nio.file.attribute.I.GROUP_WRITE;
                                        } else {
                                            posixFilePermission6 = PosixFilePermission.GROUP_EXECUTE;
                                            if (j == posixFilePermission6) {
                                                i = j$.nio.file.attribute.I.GROUP_EXECUTE;
                                            } else {
                                                posixFilePermission7 = PosixFilePermission.OTHERS_READ;
                                                if (j == posixFilePermission7) {
                                                    i = j$.nio.file.attribute.I.OTHERS_READ;
                                                } else {
                                                    posixFilePermission8 = PosixFilePermission.OTHERS_WRITE;
                                                    i = j == posixFilePermission8 ? j$.nio.file.attribute.I.OTHERS_WRITE : j$.nio.file.attribute.I.OTHERS_EXECUTE;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    hashSet.add(i);
                } catch (ClassCastException e2) {
                    C0049d.a("java.nio.file.attribute.PosixFilePermission", e2);
                    throw null;
                }
            }
            return hashSet;
        }
        C0049d.a("java.nio.file.attribute.PosixFilePermission", next.getClass());
        throw null;
    }

    public static AbstractC0026i j() {
        return AbstractC0028k.a;
    }

    public static /* synthetic */ EnumC0030m[] k(LinkOption[] linkOptionArr) {
        EnumC0030m enumC0030m;
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        EnumC0030m[] enumC0030mArr = new EnumC0030m[length];
        for (int i = 0; i < length; i++) {
            if (linkOptionArr[i] == null) {
                enumC0030m = null;
            } else {
                enumC0030m = EnumC0030m.NOFOLLOW_LINKS;
            }
            enumC0030mArr[i] = enumC0030m;
        }
        return enumC0030mArr;
    }

    public static H[] l(WatchEvent.Kind[] kindArr) {
        WatchEvent.Kind kind;
        WatchEvent.Kind kind2;
        WatchEvent.Kind kind3;
        WatchEvent.Kind kind4;
        H a2;
        if (kindArr == null) {
            return null;
        }
        int length = kindArr.length;
        H[] hArr = new H[length];
        for (int i = 0; i < length; i++) {
            WatchEvent.Kind kind5 = kindArr[i];
            if (kind5 != null) {
                kind = StandardWatchEventKinds.ENTRY_CREATE;
                if (kind5 != kind) {
                    kind2 = StandardWatchEventKinds.ENTRY_DELETE;
                    if (kind5 != kind2) {
                        kind3 = StandardWatchEventKinds.ENTRY_MODIFY;
                        if (kind5 != kind3) {
                            kind4 = StandardWatchEventKinds.OVERFLOW;
                            if (kind5 == kind4) {
                                a2 = a;
                            } else {
                                a2 = F.a(kind5);
                            }
                        } else {
                            a2 = d;
                        }
                    } else {
                        a2 = c;
                    }
                } else {
                    a2 = b;
                }
            } else {
                a2 = null;
            }
            hArr[i] = a2;
        }
        return hArr;
    }

    public static /* synthetic */ LinkOption[] m(EnumC0030m[] enumC0030mArr) {
        LinkOption linkOption;
        if (enumC0030mArr == null) {
            return null;
        }
        int length = enumC0030mArr.length;
        LinkOption[] linkOptionArr = new LinkOption[length];
        for (int i = 0; i < length; i++) {
            if (enumC0030mArr[i] != null) {
                linkOption = LinkOption.NOFOLLOW_LINKS;
            } else {
                linkOption = null;
            }
            linkOptionArr[i] = linkOption;
        }
        return linkOptionArr;
    }

    public static WatchEvent.Kind[] n(H[] hArr) {
        WatchEvent.Kind a2;
        if (hArr == null) {
            return null;
        }
        int length = hArr.length;
        WatchEvent.Kind[] kindArr = new WatchEvent.Kind[length];
        for (int i = 0; i < length; i++) {
            H h = hArr[i];
            if (h == null) {
                a2 = null;
            } else if (h == b) {
                a2 = StandardWatchEventKinds.ENTRY_CREATE;
            } else {
                a2 = h == c ? StandardWatchEventKinds.ENTRY_DELETE : h == d ? StandardWatchEventKinds.ENTRY_MODIFY : h == a ? StandardWatchEventKinds.OVERFLOW : G.a(h);
            }
            kindArr[i] = a2;
        }
        return kindArr;
    }
}
