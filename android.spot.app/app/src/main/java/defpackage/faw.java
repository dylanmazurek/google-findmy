package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class faw {
    public static final Object a = new Object();
    public static volatile faw b;
    public fgl c;
    public boolean d;
    public final Object e = new Object();
    public fau f;
    final long g;
    public fax h;
    private final Context i;

    public faw(Context context) {
        fma.aR(context);
        this.i = context.getApplicationContext();
        this.d = false;
        this.g = 30000L;
    }

    public static final void d(fav favVar, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str = "1";
            hashMap.put("app_context", "1");
            if (favVar != null) {
                if (true != favVar.b) {
                    str = "0";
                }
                hashMap.put("limit_ad_tracking", str);
                String str2 = favVar.a;
                if (str2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(str2.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new fat(hashMap).start();
        }
    }

    public final void a() {
        fma.aM("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.i != null && this.c != null) {
                try {
                    if (this.d) {
                        flr.a().b(this.i, this.c);
                    }
                } catch (Throwable unused) {
                }
                this.d = false;
                this.h = null;
                this.c = null;
            }
        }
    }

    public final void b() {
        synchronized (this.e) {
            fau fauVar = this.f;
            if (fauVar != null) {
                fauVar.a.countDown();
                try {
                    this.f.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.f = new fau(this, j);
            }
        }
    }

    public final void c(boolean z) {
        fax faxVar;
        fma.aM("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.d) {
                a();
            }
            Context context = this.i;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int g = fgq.d.g(context, 12451000);
                if (g != 0 && g != 2) {
                    throw new IOException("Google Play services not available");
                }
                fgl fglVar = new fgl();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (flr.a().c(context, intent, fglVar, 1)) {
                        this.c = fglVar;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            fma.aM("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
                            if (!fglVar.a) {
                                fglVar.a = true;
                                IBinder iBinder = (IBinder) fglVar.b.poll(10000L, timeUnit);
                                if (iBinder != null) {
                                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                    if (queryLocalInterface instanceof fax) {
                                        faxVar = (fax) queryLocalInterface;
                                    } else {
                                        faxVar = new fax(iBinder);
                                    }
                                    this.h = faxVar;
                                    this.d = true;
                                    if (z) {
                                        b();
                                    }
                                } else {
                                    throw new TimeoutException("Timed out waiting for the service connection");
                                }
                            } else {
                                throw new IllegalStateException("Cannot call get on this connection more than once");
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } else {
                        throw new IOException("Connection failure");
                    }
                } finally {
                    IOException iOException = new IOException(th);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new fhb();
            }
        }
    }

    protected final void finalize() {
        a();
        super.finalize();
    }
}
