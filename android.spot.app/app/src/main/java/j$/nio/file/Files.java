package j$.nio.file;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import j$.nio.file.attribute.InterfaceC0008f;
import j$.nio.file.attribute.InterfaceC0011i;
import j$.nio.file.attribute.InterfaceC0018p;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class Files {
    static {
        j$.desugar.sun.nio.fs.g.c(new Object[]{D.CREATE_NEW, D.WRITE});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(InputStream inputStream, Path path, CopyOption... copyOptionArr) {
        inputStream.getClass();
        int length = copyOptionArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            CopyOption copyOption = copyOptionArr[i];
            if (copyOption == StandardCopyOption.REPLACE_EXISTING) {
                i++;
                z = true;
            } else {
                if (copyOption == null) {
                    throw new NullPointerException("options contains 'null'");
                }
                throw new UnsupportedOperationException(String.valueOf(copyOption).concat(" not supported"));
            }
        }
        if (z) {
            try {
                d(path).g(path);
            } catch (SecurityException e) {
                e = e;
            }
        }
        e = null;
        try {
            OutputStream w = d(path).w(path, D.CREATE_NEW, D.WRITE);
            try {
                if (inputStream instanceof InputStreamRetargetInterface) {
                    ((InputStreamRetargetInterface) inputStream).transferTo(w);
                } else {
                    DesugarInputStream.transferTo(inputStream, w);
                }
                if (w != null) {
                    w.close();
                }
            } catch (Throwable th) {
                if (w != null) {
                    try {
                        w.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (FileAlreadyExistsException e2) {
            if (e != null) {
                throw e;
            }
            throw e2;
        }
    }

    public static boolean b(Path path, EnumC0030m... enumC0030mArr) {
        if (enumC0030mArr.length == 0) {
            d(path);
        }
        try {
            int length = enumC0030mArr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                EnumC0030m enumC0030m = enumC0030mArr[i];
                if (enumC0030m == EnumC0030m.NOFOLLOW_LINKS) {
                    i++;
                    z = false;
                } else {
                    enumC0030m.getClass();
                    throw new AssertionError("Should not get here");
                }
            }
            if (z) {
                d(path).a(path, new EnumC0002a[0]);
            } else {
                d(path).x(path, InterfaceC0011i.class, EnumC0030m.NOFOLLOW_LINKS);
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static SeekableByteChannel c(Path path, p... pVarArr) {
        Set set;
        if (pVarArr.length == 0) {
            set = Collections.emptySet();
        } else {
            HashSet hashSet = new HashSet();
            Collections.addAll(hashSet, pVarArr);
            set = hashSet;
        }
        return d(path).q(path, set, new InterfaceC0018p[0]);
    }

    private static j$.nio.file.spi.d d(Path path) {
        return path.getFileSystem().i();
    }

    public static Path move(Path path, Path path2, CopyOption... copyOptionArr) {
        EnumC0030m[] enumC0030mArr;
        j$.nio.file.spi.d d = d(path);
        if (d(path2).equals(d)) {
            d.o(path, path2, copyOptionArr);
        } else {
            int length = copyOptionArr.length;
            int i = length + 2;
            CopyOption[] copyOptionArr2 = new CopyOption[i];
            for (int i2 = 0; i2 < length; i2++) {
                CopyOption copyOption = copyOptionArr[i2];
                if (copyOption != StandardCopyOption.ATOMIC_MOVE) {
                    copyOptionArr2[i2] = copyOption;
                } else {
                    throw new AtomicMoveNotSupportedException(null, null, "Atomic move between providers is not supported");
                }
            }
            copyOptionArr2[length] = EnumC0030m.NOFOLLOW_LINKS;
            copyOptionArr2[length + 1] = StandardCopyOption.COPY_ATTRIBUTES;
            boolean z = true;
            boolean z2 = false;
            boolean z3 = false;
            for (int i3 = 0; i3 < i; i3++) {
                CopyOption copyOption2 = copyOptionArr2[i3];
                if (copyOption2 == StandardCopyOption.REPLACE_EXISTING) {
                    z2 = true;
                } else if (copyOption2 == EnumC0030m.NOFOLLOW_LINKS) {
                    z = false;
                } else if (copyOption2 == StandardCopyOption.COPY_ATTRIBUTES) {
                    z3 = true;
                } else {
                    copyOption2.getClass();
                    throw new UnsupportedOperationException("'" + String.valueOf(copyOption2) + "' is not a recognized copy option");
                }
            }
            if (z) {
                enumC0030mArr = new EnumC0030m[0];
            } else {
                enumC0030mArr = new EnumC0030m[]{EnumC0030m.NOFOLLOW_LINKS};
            }
            InterfaceC0011i x = d(path).x(path, InterfaceC0011i.class, enumC0030mArr);
            if (!x.isSymbolicLink()) {
                if (z2) {
                    d(path2).g(path2);
                } else if (b(path2, new EnumC0030m[0])) {
                    throw new FileAlreadyExistsException(path2.toString());
                }
                if (x.isDirectory()) {
                    d(path2).c(path2, new InterfaceC0018p[0]);
                } else {
                    InputStream v = d(path).v(path, new p[0]);
                    try {
                        a(v, path2, new CopyOption[0]);
                        v.close();
                    } catch (Throwable th) {
                        if (v != null) {
                            try {
                                v.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                if (z3) {
                    try {
                        ((InterfaceC0008f) d(path2).h(path2, InterfaceC0008f.class, new EnumC0030m[0])).a(x.lastModifiedTime(), x.lastAccessTime(), x.creationTime());
                    } catch (Throwable th3) {
                        try {
                            d(path2).f(path2);
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                d(path).f(path);
            } else {
                throw new IOException("Copying of symbolic links not supported");
            }
        }
        return path2;
    }
}
