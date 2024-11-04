package defpackage;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fda extends fcl {
    public volatile String a;
    public Future b;

    /* JADX INFO: Access modifiers changed from: protected */
    public fda(fcn fcnVar) {
        super(fcnVar);
    }

    public final String b() {
        String str;
        H();
        synchronized (this) {
            if (this.a == null) {
                this.b = h().a(new fcz(this, 0));
            }
            Future future = this.b;
            if (future != null) {
                try {
                    this.a = (String) future.get();
                } catch (InterruptedException e) {
                    C("ClientId loading or generation was interrupted", e);
                    this.a = "0";
                } catch (ExecutionException e2) {
                    v("Failed to load or generate client id", e2);
                    this.a = "0";
                }
                if (this.a == null) {
                    this.a = "0";
                }
                z("Loaded clientId", this.a);
                this.b = null;
            }
            str = this.a;
        }
        return str;
    }

    public final String c() {
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        try {
            Context context = h().b;
            fma.aP(lowerCase);
            fma.aM("ClientId should be saved from worker thread");
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    z("Storing clientId", lowerCase);
                    fileOutputStream = context.openFileOutput("gaClientId", 0);
                    fileOutputStream.write(lowerCase.getBytes());
                    return lowerCase;
                } catch (FileNotFoundException e) {
                    v("Error creating clientId file", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e2) {
                            e = e2;
                            v("Failed to close clientId writing stream", e);
                            return "0";
                        }
                    }
                    return "0";
                } catch (IOException e3) {
                    v("Error writing to clientId file", e3);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            e = e4;
                            v("Failed to close clientId writing stream", e);
                            return "0";
                        }
                    }
                    return "0";
                }
            } finally {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e5) {
                        v("Failed to close clientId writing stream", e5);
                    }
                }
            }
        } catch (Exception e6) {
            v("Error saving clientId file", e6);
            return "0";
        }
    }

    @Override // defpackage.fcl
    protected final void a() {
    }
}
