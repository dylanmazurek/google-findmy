package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.nio.file.AbstractC0026i;
import j$.nio.file.C0021d;
import j$.nio.file.CopyOption;
import j$.nio.file.D;
import j$.nio.file.EnumC0002a;
import j$.nio.file.EnumC0030m;
import j$.nio.file.Files;
import j$.nio.file.Path;
import j$.nio.file.attribute.InterfaceC0011i;
import j$.nio.file.attribute.InterfaceC0018p;
import j$.nio.file.attribute.v;
import j$.nio.file.p;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public abstract class d {
    private static final Set a = g.c(new Object[]{D.CREATE, D.TRUNCATE_EXISTING, D.WRITE});

    /* JADX INFO: Access modifiers changed from: protected */
    public d() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new RuntimePermission("fileSystemProvider"));
        }
    }

    public abstract void A(Path path, String str, Object obj, EnumC0030m... enumC0030mArr);

    public abstract void a(Path path, EnumC0002a... enumC0002aArr);

    public abstract void b(Path path, Path path2, CopyOption... copyOptionArr);

    public abstract void c(Path path, InterfaceC0018p... interfaceC0018pArr);

    public abstract void d(Path path, Path path2);

    public abstract void e(Path path, Path path2, InterfaceC0018p... interfaceC0018pArr);

    public abstract void f(Path path);

    public abstract boolean g(Path path);

    public abstract v h(Path path, Class cls, EnumC0030m... enumC0030mArr);

    public abstract C0021d i(Path path);

    public abstract AbstractC0026i j(URI uri);

    public abstract Path k(URI uri);

    public abstract String l();

    public abstract boolean m(Path path);

    public abstract boolean n(Path path, Path path2);

    public abstract void o(Path path, Path path2, CopyOption... copyOptionArr);

    public abstract j$.nio.channels.a p(Path path, Set set, ExecutorService executorService, InterfaceC0018p... interfaceC0018pArr);

    public abstract SeekableByteChannel q(Path path, Set set, InterfaceC0018p... interfaceC0018pArr);

    public abstract DirectoryStream r(Path path, j$.nio.file.v vVar);

    public abstract FileChannel s(Path path, Set set, InterfaceC0018p... interfaceC0018pArr);

    public AbstractC0026i t(Path path, Map map) {
        throw new UnsupportedOperationException();
    }

    public abstract AbstractC0026i u(URI uri, Map map);

    public InputStream v(Path path, p... pVarArr) {
        if (pVarArr.length > 0) {
            for (p pVar : pVarArr) {
                if (pVar == D.APPEND || pVar == D.WRITE) {
                    throw new UnsupportedOperationException("'" + String.valueOf(pVar) + "' not allowed");
                }
            }
        }
        return Channels.newInputStream(Files.c(path, pVarArr));
    }

    public OutputStream w(Path path, p... pVarArr) {
        Set set;
        if (pVarArr.length == 0) {
            set = a;
        } else {
            HashSet hashSet = new HashSet();
            for (p pVar : pVarArr) {
                if (pVar != D.READ) {
                    hashSet.add(pVar);
                } else {
                    throw new IllegalArgumentException("READ not allowed");
                }
            }
            hashSet.add(D.WRITE);
            set = hashSet;
        }
        return Channels.newOutputStream(q(path, set, new InterfaceC0018p[0]));
    }

    public abstract InterfaceC0011i x(Path path, Class cls, EnumC0030m... enumC0030mArr);

    public abstract Map y(Path path, String str, EnumC0030m... enumC0030mArr);

    public abstract Path z(Path path);
}
