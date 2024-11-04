package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import j$.util.Objects;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fgd extends BroadcastReceiver {
    public static SoftReference a;
    private static SoftReference b;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int a(Context context, CloudMessage cloudMessage);

    protected void b(Bundle bundle) {
        throw null;
    }

    public final int c(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            b(extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        ExecutorService executorService;
        ExecutorService executorService2;
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        synchronized (fgd.class) {
            SoftReference softReference = b;
            if (softReference != null) {
                executorService = (ExecutorService) softReference.get();
            } else {
                executorService = null;
            }
            if (executorService == null) {
                frx frxVar = fqv.a;
                executorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new fmd("firebase-iid-executor")));
                b = new SoftReference(executorService);
            }
            executorService2 = executorService;
        }
        executorService2.execute(new Runnable() { // from class: fgc
            @Override // java.lang.Runnable
            public final void run() {
                Intent intent2;
                int i;
                Intent intent3 = intent;
                BroadcastReceiver.PendingResult pendingResult = goAsync;
                try {
                    Parcelable parcelableExtra = intent3.getParcelableExtra("wrapped_intent");
                    Executor executor = null;
                    if (parcelableExtra instanceof Intent) {
                        intent2 = (Intent) parcelableExtra;
                    } else {
                        intent2 = null;
                    }
                    Context context2 = context;
                    fgd fgdVar = fgd.this;
                    if (intent2 != null) {
                        i = fgdVar.c(intent2);
                    } else if (intent3.getExtras() == null) {
                        i = 500;
                    } else {
                        CloudMessage cloudMessage = new CloudMessage(intent3);
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        synchronized (fgd.class) {
                            SoftReference softReference2 = fgd.a;
                            if (softReference2 != null) {
                                executor = (Executor) softReference2.get();
                            }
                            if (executor == null) {
                                frx frxVar2 = fqv.a;
                                executor = frx.n(new fmd("pscm-ack-executor"));
                                fgd.a = new SoftReference(executor);
                            }
                        }
                        executor.execute(new ci(context2, cloudMessage, countDownLatch, 12, (short[]) null));
                        int a2 = fgdVar.a(context2, cloudMessage);
                        try {
                            if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                Log.w("CloudMessagingReceiver", "Message ack timed out");
                            }
                        } catch (InterruptedException e) {
                            Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e.toString()));
                        }
                        i = a2;
                    }
                    if (isOrderedBroadcast && pendingResult != null) {
                        pendingResult.setResultCode(i);
                    }
                } finally {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                }
            }
        });
    }
}
