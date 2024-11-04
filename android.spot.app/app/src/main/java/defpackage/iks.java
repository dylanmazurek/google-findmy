package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import j$.nio.channels.DesugarChannels;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iks implements ijv {
    public boolean a;
    private final boolean b;
    private final boolean c;

    public iks(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r13v12, types: [ikz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v8, types: [ikz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [ikz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [ikz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [ikz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [ikz, java.lang.Object] */
    @Override // defpackage.ijv
    public final /* bridge */ /* synthetic */ Object a(kqr kqrVar) {
        ike ikeVar;
        Closeable d;
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        jer a;
        ?? r0;
        FileLock tryLock;
        Uri build = ((Uri) kqrVar.a).buildUpon().path(String.valueOf(((Uri) kqrVar.c).getPath()).concat(".lock")).fragment("").build();
        Closeable closeable = null;
        if (this.a) {
            Semaphore b = kqrVar.e.a().b(build.toString());
            if (true != b.tryAcquire()) {
                b = null;
            }
            ikf ikfVar = new ikf(b);
            try {
                if (ikfVar.a != null) {
                    ikeVar = new ike(ikfVar.a(), 0);
                    ikfVar.close();
                } else {
                    ikfVar.close();
                    ikeVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            Semaphore b2 = kqrVar.e.a().b(build.toString());
            try {
                b2.acquire();
                ikf ikfVar2 = new ikf(b2);
                try {
                    ikeVar = new ike(ikfVar2.a(), 0);
                    ikfVar2.close();
                } finally {
                    try {
                        ikfVar2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            } catch (InterruptedException e) {
                throw new InterruptedIOException("semaphore not acquired: ".concat(e.toString()));
            }
        }
        iki ikiVar = new iki(ikeVar);
        try {
            if (ikiVar.a != null) {
                if (this.b) {
                    if (this.c) {
                        d = kqrVar.e.c(build);
                    } else {
                        d = (Closeable) ((kpb) kqrVar.b).n(build, new ikt(0));
                    }
                } else {
                    d = kqrVar.e.d(build);
                }
                iki ikiVar2 = new iki(d);
                try {
                    Closeable closeable2 = ikiVar2.a;
                    if (closeable2 instanceof ikb) {
                        convertMaybeLegacyFileChannelFromLibrary = ((ikb) closeable2).a();
                    } else if (closeable2 instanceof RandomAccessFile) {
                        convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((RandomAccessFile) closeable2).getChannel());
                    } else {
                        throw new IOException("Lock stream not convertible to FileChannel");
                    }
                    FileChannel fileChannel = convertMaybeLegacyFileChannelFromLibrary;
                    if (this.a) {
                        kqrVar.e.a();
                        try {
                            tryLock = fileChannel.tryLock(0L, Long.MAX_VALUE, this.b);
                        } catch (IOException unused) {
                        }
                        if (tryLock != null) {
                            r0 = new ike(tryLock, 1);
                        } else {
                            r0 = 0;
                        }
                    } else {
                        kqrVar.e.a();
                        boolean z = this.b;
                        jer a2 = ikg.a(fileChannel, z);
                        if (a2.g()) {
                            r0 = a2.c();
                        } else {
                            ikg.a.longValue();
                            ikg.b.longValue();
                            hwx.J(true);
                            hwx.J(true);
                            ikn iknVar = new ikn();
                            do {
                                SystemClock.sleep(iknVar.next().longValue());
                                a = ikg.a(fileChannel, z);
                            } while (!a.g());
                            r0 = a.c();
                        }
                    }
                    iki ikiVar3 = new iki(r0);
                    try {
                        if (ikiVar3.a == null) {
                            ikiVar3.close();
                        } else {
                            final Closeable a3 = ikiVar.a();
                            final Closeable a4 = ikiVar2.a();
                            final Closeable a5 = ikiVar3.a();
                            closeable = new Closeable() { // from class: ikr
                                @Override // java.io.Closeable, java.lang.AutoCloseable
                                public final void close() {
                                    Closeable closeable3 = a3;
                                    Closeable closeable4 = a4;
                                    Closeable closeable5 = a5;
                                    if (closeable5 != null) {
                                        try {
                                            try {
                                                closeable5.close();
                                            } catch (Throwable th3) {
                                                if (closeable4 != null) {
                                                    try {
                                                        closeable4.close();
                                                    } catch (Throwable th4) {
                                                        th3.addSuppressed(th4);
                                                    }
                                                }
                                                throw th3;
                                            }
                                        } catch (Throwable th5) {
                                            if (closeable3 != null) {
                                                try {
                                                    closeable3.close();
                                                } catch (Throwable th6) {
                                                    th5.addSuppressed(th6);
                                                }
                                            }
                                            throw th5;
                                        }
                                    }
                                    if (closeable4 != null) {
                                        closeable4.close();
                                    }
                                    if (closeable3 != null) {
                                        closeable3.close();
                                    }
                                }
                            };
                            ikiVar3.close();
                        }
                        ikiVar2.close();
                    } finally {
                    }
                } finally {
                }
            }
            ikiVar.close();
            return closeable;
        } catch (Throwable th3) {
            try {
                ikiVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
